package com.nt.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DTDCCourierService {
	private Integer trackingId = new Random().nextInt(1000000);
	private String sourceLoc;
	private String destinationLoc;
}
