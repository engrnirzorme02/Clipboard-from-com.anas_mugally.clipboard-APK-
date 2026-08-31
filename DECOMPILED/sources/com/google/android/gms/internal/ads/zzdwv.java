package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwv extends zzfrr {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwu zzf;
    private boolean zzg;

    zzdwv(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzdwu zzdwuVar) {
        this.zzf = zzdwuVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjM)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i7 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = C7351t.m32357o().mo18159a() - ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzjO)).intValue());
                        this.zzg = true;
                        AbstractC3490o0.m17545k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        AbstractC3490o0.m17545k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjM)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f7 = fArr[0] / 9.80665f;
            float f8 = fArr[1] / 9.80665f;
            float f9 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f7 * f7) + (f8 * f8) + (f9 * f9))) >= ((Float) C3250D.m17200c().zzd(zzbci.zzjN)).floatValue()) {
                long jMo18159a = C7351t.m32357o().mo18159a();
                if (this.zzd + ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzjO)).intValue()) <= jMo18159a) {
                    if (this.zzd + ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzjP)).intValue()) < jMo18159a) {
                        this.zze = 0;
                    }
                    AbstractC3490o0.m17545k("Shake detected.");
                    this.zzd = jMo18159a;
                    int i7 = this.zze + 1;
                    this.zze = i7;
                    zzdwu zzdwuVar = this.zzf;
                    if (zzdwuVar != null) {
                        if (i7 == ((Integer) C3250D.m17200c().zzd(zzbci.zzjQ)).intValue()) {
                            zzdvs zzdvsVar = (zzdvs) zzdwuVar;
                            zzdvsVar.zzo(new zzdvp(zzdvsVar), zzdvr.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
