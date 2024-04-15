/*package com.fp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fp.service.BillService;

@RestController
public class BillController {
	
	@Autowired
	private BillService bService;
	
	
	
	@PostMapping("/bill")
	public ResponseEntity<BillDto> registeBillHandler(@RequestBody Bill bill) throws BillException{
		
		BillDto bil1 = bService.addBill(bill);
		
		
		return new ResponseEntity<>(bil1,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/bill")
	public ResponseEntity<Bill> updateBillHandler(@RequestBody Bill bill) throws BillException{
		
		Bill bill1 = bService.updateBill(bill);
	
		return new ResponseEntity<Bill>(bill1,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/bill/{bid}")
	public ResponseEntity<Bill> deleteBillHandler(@PathVariable("bid")Integer bid) throws BillException{
		
		Bill bill1 = bService.removeBill(bid);

		return new ResponseEntity<Bill>(bill1,HttpStatus.OK);
	}
	
	@GetMapping("/bill/{bid}")
	public ResponseEntity<Bill> getBillHandler(@PathVariable("bid")Integer bid) throws BillException{
		
		Bill bill1 = bService.viewBill(bid);

		return new ResponseEntity<Bill>(bill1,HttpStatus.OK);
	}

}*/
