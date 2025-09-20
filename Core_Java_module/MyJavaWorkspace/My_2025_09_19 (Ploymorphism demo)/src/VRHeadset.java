class VRHeadset{
	String name,company;
	int resolution;
	
	VRHeadset() {
		this.name = "Default";
		this.company = "Any";
		this.resolution = 1080;
	}
	
	VRHeadset(String name, String company, int resolution) {
		this.name = name;
		this.company = company;
		this.resolution = resolution;
	}

	String getName() {
		return name;
	}

	String getCompany() {
		return company;
	}

	int getResolution() {
		return resolution;
	}

	void setName(String name) {
		this.name = name;
	}

	void setCompany(String company) {
		this.company = company;
	}

	void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
	//polymorphic behavior
	void calibrate() {
		System.out.println("start calibrating");
	}
	void display() {
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Company : "+this.company);
		System.out.println("Resolution : "+this.resolution);
	}
	
} //VRHeadset ends here

class GamingVR extends VRHeadset{
	int fpsRate;

	GamingVR() {
		super();
		this.fpsRate = 60;
	}
	
	GamingVR(String name, String company, int resolution,int fpsRate) {
		super(name,company,resolution);
		this.fpsRate = fpsRate;
	}
	
	int getFpsRate() {
		return fpsRate;
	}

	void setFpsRate(int fpsRate) {
		this.fpsRate = fpsRate;
	}

	//polymorphic behavior
	void calibrate() {
		System.out.println("start calibrating basic controls");
	}
	void display() {
		super.display();
		System.out.println("FPS Rate : "+this.fpsRate);
	}
	
} //GamingVR ends here

class TrainingVR extends VRHeadset{
	int physicsAccuracyLevel,stressLevel;

	TrainingVR() {
		super();
		this.physicsAccuracyLevel = 5;
		this.stressLevel = 5;
	}
	
	TrainingVR(String name, String company, int resolution,int physicsAccuracyLevel, int stressLevel) {
		super(name,company,resolution);
		this.physicsAccuracyLevel = physicsAccuracyLevel;
		this.stressLevel = stressLevel;
	}
	
	//polymorphic behavior
	void calibrate() {
		System.out.println("start calibrating the parts to train");
	}
	void display() {
		super.display();
		System.out.println("Physics Accuracy Level : "+this.physicsAccuracyLevel);
		System.out.println("Stress Level : "+this.stressLevel);
	}
} //TrainingVR ends here
class TestVRHeadset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VRHeadset vr1;
		
		vr1= new VRHeadset("VisionPro", "Apple", 2160);
		vr1.display();
		vr1.calibrate();
		
        vr1=new GamingVR("Oculus Quest", "Meta", 2880, 120);
		vr1.display();
		vr1.calibrate();
		
        vr1= new TrainingVR("HTC Vive Pro", "HTC", 2440, 9, 7);
		vr1.display();
		vr1.calibrate();
	} //main ends here

} //TestVRHeadset ends here
