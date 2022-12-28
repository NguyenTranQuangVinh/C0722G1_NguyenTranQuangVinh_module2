package FuramaResort.Services.impl;

import FuramaResort.Models.Facility;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;
import FuramaResort.Services.IFacilityService;
import FuramaResort.Utils.ReadFile;
import FuramaResort.Utils.WriteFile;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    //    private static final Map<Facility, Integer> readFacility = new LinkedHashMap<>();
    //    Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    Map<Facility, Integer> readFacility = new LinkedHashMap<>();
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
        System.out.println("Tên dịch vụ:");
        room.setNameService(scanner.nextLine());
        System.out.println("Diện tích sử dụng:");
        room.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Chi phí thuê:");
        room.setCosts(Integer.parseInt(scanner.nextLine()));
        System.out.println("Số lượng người tối đa:");
        room.setAmount(Integer.parseInt(scanner.nextLine()));
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
        System.out.println("Tên dịch vụ :");
        villa.setNameService(scanner.nextLine());
        System.out.println("Diện tích sử dụng :");
        villa.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Chi phí thuê :");
        villa.setCosts(Integer.parseInt(scanner.nextLine()));
        System.out.println("Số lượng người tối đa:");
        villa.setAmount(Integer.parseInt(scanner.nextLine()));
        System.out.println("Kiểu thuê:");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Tiêu chuẩn phòng:");
        villa.setRoomStandard(scanner.nextLine());
        System.out.println("Diện tích hồ bơi:");
        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Sô tầng:");
        villa.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        villaIntegerMap.put(villa, 0);
        writeFileVilla(villaIntegerMap);
    }
}
