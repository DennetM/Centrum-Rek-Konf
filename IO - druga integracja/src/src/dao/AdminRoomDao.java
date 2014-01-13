package dao;

import java.util.ArrayList;
import java.util.List;

import model.EquipmentModel;
import model.RoomModel;

/**
 * 
 * DAO do administrowania pokojami
 * 
 * 
 */
public class AdminRoomDao extends BaseDao {

	public List<RoomModel> getListRoomData() {
		List<RoomModel> result = new ArrayList<>();
		result = fasade.getListRoomData();
		return result;
	}
	
	public RoomModel getRoomData(int roomID) {
		RoomModel result = null;
		result = fasade.getRoom(roomID);
		return result;
	}
	
	public EquipmentModel getEquipment(int equipmentID) {
		EquipmentModel result=null;
		result = fasade.getEquipment(equipmentID);
		return result;
	}

	public RoomModel getFullRoomData(int roomID) {
		RoomModel roomResult=getRoomData(roomID);
		if (roomResult != null) {
			EquipmentModel equipResult = getEquipment(roomResult.getEquipmentID());
			roomResult.setEquipmentHandle(equipResult);
		}
		return roomResult;
	}


}
