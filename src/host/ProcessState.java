package host;

import java.io.Serializable;

/*
 * Kuvaa prosessin tilaa. False tarkoittaa, että laite on vapaa, true tarkoittaa varattua.
 */

public class ProcessState implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private boolean siloLoader;
	private boolean silo1;
	private boolean silo2;
	private boolean silo3;
	private boolean silo4;
	private boolean procLoader1;
	private boolean procLoader2;
	private boolean proc1;
	private boolean proc2;
	private boolean proc3;
	private boolean pump1;
	private boolean pump2;
	private boolean tank1;
	private boolean tank2;
	private boolean tank3;
	private boolean tank4;
	private boolean tank5;
	private boolean tank6;
	private boolean tank7;
	private boolean tank8;
	private boolean tank9;
	private boolean tank10;
	private boolean bottlePump1;
	private boolean bottlePump2;

	public ProcessState(){
		siloLoader = false;
		silo1 = false;
		silo2 = false;
		silo3 = false;
		silo4 = false;
		procLoader1 = false;
		procLoader2 = false;
		proc1 = false;
		proc2 = false;
		proc3 = false;
		pump1 = false;
		pump2 = false;
		tank1 = false;
		tank2 = false;
		tank3 = false;
		tank4 = false;
		tank5 = false;
		tank6 = false;
		tank7 = false;
		tank8 = false;
		tank9 = false;
		tank10 = false;
		bottlePump1 = false;
		bottlePump2 = false;
	}
	
	public boolean isSiloLoader() {
		return siloLoader;
	}

	public boolean isSilo1() {
		return silo1;
	}

	public boolean isSilo2() {
		return silo2;
	}

	public boolean isSilo3() {
		return silo3;
	}

	public boolean isSilo4() {
		return silo4;
	}

	public boolean isProcLoader1() {
		return procLoader1;
	}

	public boolean isProcLoader2() {
		return procLoader2;
	}

	public boolean isProc1() {
		return proc1;
	}

	public boolean isProc2() {
		return proc2;
	}

	public boolean isProc3() {
		return proc3;
	}

	public boolean isPump1() {
		return pump1;
	}

	public boolean isPump2() {
		return pump2;
	}

	public boolean isTank1() {
		return tank1;
	}

	public boolean isTank2() {
		return tank2;
	}

	public boolean isTank3() {
		return tank3;
	}

	public boolean isTank4() {
		return tank4;
	}

	public boolean isTank5() {
		return tank5;
	}

	public boolean isTank6() {
		return tank6;
	}

	public boolean isTank7() {
		return tank7;
	}

	public boolean isTank8() {
		return tank8;
	}

	public boolean isTank9() {
		return tank9;
	}

	public boolean isTank10() {
		return tank10;
	}

	public boolean isBottlePump1() {
		return bottlePump1;
	}

	public boolean isBottlePump2() {
		return bottlePump2;
	}

	public void setSiloLoader(boolean siloLoader) {
		this.siloLoader = siloLoader;
	}

	public void setSilo1(boolean silo1) {
		this.silo1 = silo1;
	}

	public void setSilo2(boolean silo2) {
		this.silo2 = silo2;
	}

	public void setSilo3(boolean silo3) {
		this.silo3 = silo3;
	}

	public void setSilo4(boolean silo4) {
		this.silo4 = silo4;
	}

	public void setProcLoader1(boolean procLoader1) {
		this.procLoader1 = procLoader1;
	}

	public void setProcLoader2(boolean procLoader2) {
		this.procLoader2 = procLoader2;
	}

	public void setProc1(boolean proc1) {
		this.proc1 = proc1;
	}

	public void setProc2(boolean proc2) {
		this.proc2 = proc2;
	}

	public void setProc3(boolean proc3) {
		this.proc3 = proc3;
	}

	public void setPump1(boolean pump1) {
		this.pump1 = pump1;
	}

	public void setPump2(boolean pump2) {
		this.pump2 = pump2;
	}

	public void setTank1(boolean tank1) {
		this.tank1 = tank1;
	}

	public void setTank2(boolean tank2) {
		this.tank2 = tank2;
	}

	public void setTank3(boolean tank3) {
		this.tank3 = tank3;
	}

	public void setTank4(boolean tank4) {
		this.tank4 = tank4;
	}

	public void setTank5(boolean tank5) {
		this.tank5 = tank5;
	}

	public void setTank6(boolean tank6) {
		this.tank6 = tank6;
	}

	public void setTank7(boolean tank7) {
		this.tank7 = tank7;
	}

	public void setTank8(boolean tank8) {
		this.tank8 = tank8;
	}

	public void setTank9(boolean tank9) {
		this.tank9 = tank9;
	}

	public void setTank10(boolean tank10) {
		this.tank10 = tank10;
	}

	public void setBottlePump1(boolean bottlePump1) {
		this.bottlePump1 = bottlePump1;
	}

	public void setBottlePump2(boolean bottlePump2) {
		this.bottlePump2 = bottlePump2;
	}
}
