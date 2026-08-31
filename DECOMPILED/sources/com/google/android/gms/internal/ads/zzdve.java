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
public final class zzdve extends zzfrr {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzdvd zzi;
    private boolean zzj;

    zzdve(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = C7351t.m32357o().mo18159a();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzdvd zzdvdVar) {
        this.zzi = zzdvdVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjR)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        AbstractC3490o0.m17545k("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    AbstractC3490o0.m17545k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjR)).booleanValue()) {
            long jMo18159a = C7351t.m32357o().mo18159a();
            if (this.zze + ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzjT)).intValue()) < jMo18159a) {
                this.zzf = 0;
                this.zze = jMo18159a;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float fValueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f7 = this.zzc;
            zzbbz zzbbzVar = zzbci.zzjS;
            if (fFloatValue > f7 + ((Float) C3250D.m17200c().zzd(zzbbzVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) C3250D.m17200c().zzd(zzbbzVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                AbstractC3490o0.m17545k("Flick detected.");
                this.zze = jMo18159a;
                int i7 = this.zzf + 1;
                this.zzf = i7;
                this.zzg = false;
                this.zzh = false;
                zzdvd zzdvdVar = this.zzi;
                if (zzdvdVar != null) {
                    if (i7 == ((Integer) C3250D.m17200c().zzd(zzbci.zzjU)).intValue()) {
                        zzdvs zzdvsVar = (zzdvs) zzdvdVar;
                        zzdvsVar.zzo(new zzdvq(zzdvsVar), zzdvr.GESTURE);
                    }
                }
            }
        }
    }
}
