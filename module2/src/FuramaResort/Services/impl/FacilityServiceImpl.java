package FuramaResort.Services.impl;

import FuramaResort.Models.Facility;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;
import FuramaResort.Services.IFacilityService;
import FuramaResort.Utils.ExceptionHandling;
import FuramaResort.Utils.ReadFile;
import FuramaResort.Utils.Regex;
import FuramaResort.Utils.WriteFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private ExceptionHandling exceptionHandling = new ExceptionHandling();
    private Regex regex = new Regex();
    //    private static final Map<Facility, Integer> readFacility = new LinkedHashMap<>();
    //    Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    final String PATH_ROOM = "src\\FuramaResort\\Data\\room.csv";
    final String PATH_VILLA = "src\\FuramaResort\\Data\\villa.csv";

    public void writeFileRoom(Map<Room, Integer> integerMap) {
        WriteFile.writeFileRoom(PATH_ROOM, integerMap);
    }

    public void writeFileVilla(Map<Villa, Integer> integerMap) {
        WriteFile.writeFileVilla(PATH_VILLA, integerMap);
    }

    @Override
    public void displayFacility() {
        Map<Facility, Integer> readFacility = new LinkedHashMap<>();
        Map<Villa, Integer> villaIntegerMap = ReadFile.readFileVillaMap(PATH_VILLA);
        readFacility.putAll(villaIntegerMap);
        Map<Room, Integer> roomIntegerMap = ReadFile.readFileRoomMap(PATH_ROOM);
        readFacility.putAll(roomIntegerMap);
        for (Map.Entry<Facility, Integer> map : readFacility.entrySet()) {
            System.out.println(map.getKey().toString() + "," + map.getValue());
        }
    }


    @Override
    public void displayMaintenance() {
        Map<Facility,Integer> readFacility = new LinkedHashMap<>();
        Map<Villa, Integer> villaIntegerMap = ReadFile.readFileVillaMap(PATH_VILLA);
        readFacility.putAll(villaIntegerMap);
        Map<Room, Integer> roomIntegerMap = ReadFile.readFileRoomMap(PATH_ROOM);
        readFacility.putAll(roomIntegerMap);
        for (Map.Entry<Facility, Integer> map : readFacility.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey().toString() + "," + map.getValue());
            }
        }
    }

    @Override
    public void addRoom() {
        Map<Room, Integer> roomIntegerMap = ReadFile.readFileRoomMap(PATH_ROOM);
        Room room = new Room();
        System.out.println("Vui lòng điền thông tin sau: ");
        System.out.println("mã dịch vụ:");
        room.setIdService(regex.enterRoomInfo());
        System.out.println("Tên dịch vụ:");
        room.setNameService(regex.enterServiceInfo());
        System.out.println("Diện tích sử dụng:");
        room.setArea(exceptionHandling.enterArea());
        System.out.println("Chi phí thuê:");
        room.setCosts(exceptionHandling.enterDouble());
        System.out.println("Số lượng người tối đa:");
        room.setAmount(exceptionHandling.enterNumberOfPeople());
        System.out.println("Kiểu thuê:");
        room.setRentalType(scanner.nextLine());
        System.out.println("Dịch vụ miễn phí đi kèm: ");
        room.setFreeServiceIncluded(scanner.nextLine());
        roomIntegerMap.put(room, 0);
        writeFileRoom(roomIntegerMap);
    }

    @Override
    public void addVilla() {
        Map<Villa, Integer> villaIntegerMap = ReadFile.readFileVillaMap(PATH_VILLA);
        Villa villa = new Villa();
        System.out.println("Vui lòng điền thông tin sau : ");
        System.out.println("Mã dịch vụ:");
        villa.setIdService(regex.enterVillaInfo());
        System.out.println("Tên dịch vụ :");
        villa.setNameService(regex.enterServiceInfo());
        System.out.println("Diện tích sử dụng :");
        villa.setArea(exceptionHandling.enterArea());
        System.out.println("Chi phí thuê :");
        villa.setCosts(exceptionHandling.enterDouble());
        System.out.println("Số lượng người tối đa:");
        villa.setAmount(exceptionHandling.enterNumberOfPeople());
        System.out.println("Kiểu thuê:");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Tiêu chuẩn phòng:");
        villa.setRoomStandard(regex.enterServiceInfo());
        System.out.println("Diện tích hồ bơi:");
        villa.setPoolArea(exceptionHandling.enterArea());
        System.out.println("Sô tầng:");
        villa.setNumberOfFloors(exceptionHandling.enterPositiveInteger());
        villaIntegerMap.put(villa, 0);
        writeFileVilla(villaIntegerMap);
    }
}
