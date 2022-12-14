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
        System.out.println("Vui l??ng ??i???n th??ng tin sau: ");
        System.out.println("m?? d???ch v???:");
        room.setIdService(regex.enterRoomInfo());
        System.out.println("T??n d???ch v???:");
        room.setNameService(regex.enterServiceInfo());
        System.out.println("Di???n t??ch s??? d???ng:");
        room.setArea(exceptionHandling.enterArea());
        System.out.println("Chi ph?? thu??:");
        room.setCosts(exceptionHandling.enterDouble());
        System.out.println("S??? l?????ng ng?????i t???i ??a:");
        room.setAmount(exceptionHandling.enterNumberOfPeople());
        System.out.println("Ki???u thu??:");
        room.setRentalType(scanner.nextLine());
        System.out.println("D???ch v??? mi???n ph?? ??i k??m: ");
        room.setFreeServiceIncluded(scanner.nextLine());
        roomIntegerMap.put(room, 0);
        writeFileRoom(roomIntegerMap);
    }

    @Override
    public void addVilla() {
        Map<Villa, Integer> villaIntegerMap = ReadFile.readFileVillaMap(PATH_VILLA);
        Villa villa = new Villa();
        System.out.println("Vui l??ng ??i???n th??ng tin sau : ");
        System.out.println("M?? d???ch v???:");
        villa.setIdService(regex.enterVillaInfo());
        System.out.println("T??n d???ch v??? :");
        villa.setNameService(regex.enterServiceInfo());
        System.out.println("Di???n t??ch s??? d???ng :");
        villa.setArea(exceptionHandling.enterArea());
        System.out.println("Chi ph?? thu?? :");
        villa.setCosts(exceptionHandling.enterDouble());
        System.out.println("S??? l?????ng ng?????i t???i ??a:");
        villa.setAmount(exceptionHandling.enterNumberOfPeople());
        System.out.println("Ki???u thu??:");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Ti??u chu???n ph??ng:");
        villa.setRoomStandard(regex.enterServiceInfo());
        System.out.println("Di???n t??ch h??? b??i:");
        villa.setPoolArea(exceptionHandling.enterArea());
        System.out.println("S?? t???ng:");
        villa.setNumberOfFloors(exceptionHandling.enterPositiveInteger());
        villaIntegerMap.put(villa, 0);
        writeFileVilla(villaIntegerMap);
    }
}
