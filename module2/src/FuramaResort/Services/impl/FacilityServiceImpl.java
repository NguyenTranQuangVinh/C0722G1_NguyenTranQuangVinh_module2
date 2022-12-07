package FuramaResort.Services.impl;

import FuramaResort.Models.Facility;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;
import FuramaResort.Services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    LinkedHashMap<Facility,Integer> linkedHashMap= new LinkedHashMap<>();
    @Override
    public void displayFacility() {
        for (Map.Entry<Facility,Integer> map: linkedHashMap.entrySet()) {
            System.out.println(map.getKey().toString()+","+map.getValue());
        }
    }


    @Override
    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer>map:linkedHashMap.entrySet()
             ) {
            if (map.getValue()>=5){
                System.out.println(map.getKey().toString()+","+map.getValue());
            }
        }
    }
//    public void getRoomList(){
//
//    }
//    Map<Villa,Integer> getListMap(){
//
//        return null;
//    }
//    Map<Room,Integer> getListRoom(){
//
//    }
//    Map<Facility,Integer> getListFacility(){
//
//    }

    @Override
    public void addRoom() {
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

    }

    @Override
    public void addVilla() {
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
    }

}
