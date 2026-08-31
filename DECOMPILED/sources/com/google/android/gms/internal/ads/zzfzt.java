package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzt extends zzfzq {
    private final Map zza;
    private final zzfym zzb;
    private final DisplayMetrics zzc;

    zzfzt(zzarw zzarwVar, zzfym zzfymVar, Map map, DisplayMetrics displayMetrics, zzgea zzgeaVar) {
        super("Dk7le2G0L6HUcIBYYyRiEXeHVDMO/oBbMEwszwNBPNgJgR0rMIgTO+3VcCYkagiO", "MEG24O0q7awNaelraWn+3ttzyyjUPdINDQhT32ek/uA=", zzarwVar, zzfymVar, zzgeaVar.zza(123));
        this.zzb = zzfymVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d7, DisplayMetrics displayMetrics) {
        return Math.round(d7 / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        Object[] objArr;
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr2.getClass();
        zzasp zzaspVarZza = zzasq.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zzaspVarZza.zza(((Long) obj).longValue());
            zzaspVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zzaspVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zzaspVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zzaspVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zzaspVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zzaspVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zzaspVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zzaspVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzarwVar) {
            try {
                Method methodZzc = this.zzb.zzc("Oo51wfjSr3e0tlSFcZlk4moN1riB7K5QqAElL+VBM20G5yPiNcxL5OZ2+w3rRCgD", "S96ZfaiY+bqhATbTeqYp/0N9f7wy1g2H4l/6SL8+nl8=");
                if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj9 = objArr[0];
                if (obj9 != null) {
                    zzarwVar.zzh(((Long) obj9).longValue());
                }
                Object obj10 = objArr[1];
                if (obj10 != null) {
                    zzarwVar.zzi(((Long) obj10).longValue());
                }
                Object obj11 = objArr[2];
                if (obj11 != null) {
                    zzarwVar.zzj(((Long) obj11).longValue());
                }
                Object obj12 = objArr[3];
                if (obj12 != null) {
                    zzarwVar.zzv(((Long) obj12).longValue());
                }
                Object obj13 = objArr[4];
                if (obj13 != null) {
                    zzarwVar.zzw(((Long) obj13).longValue());
                }
                zzfxg zzfxgVar = (zzfxg) map.get("oe");
                if (zzfxgVar != null) {
                    long j7 = zzfxgVar.zza;
                    if (j7 > 0) {
                        zzarwVar.zzz(j7);
                    }
                    long j8 = zzfxgVar.zzb;
                    if (j8 > 0) {
                        zzarwVar.zzy(j8);
                    }
                    long j9 = zzfxgVar.zzc;
                    if (j9 > 0) {
                        zzarwVar.zzx(j9);
                    }
                    long j10 = zzfxgVar.zzd;
                    if (j10 > 0) {
                        zzarwVar.zzA(j10);
                    }
                }
                zzfxg zzfxgVar2 = (zzfxg) map.get("oe");
                if (zzfxgVar2 != null && zzfxgVar2.zza != 0 && zzc(displayMetrics)) {
                    double d7 = zzfxgVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaspVarZza.zzl(zzb(d7, displayMetrics));
                    zzaspVarZza.zzm(zzb(zzfxgVar2.zzh - zzfxgVar2.zzf, displayMetrics));
                    zzaspVarZza.zzn(zzb(zzfxgVar2.zzi - zzfxgVar2.zzg, displayMetrics));
                    zzaspVarZza.zzq(zzb(zzfxgVar2.zzf, displayMetrics));
                    zzaspVarZza.zzr(zzb(zzfxgVar2.zzg, displayMetrics));
                    MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                    if (motionEvent2 != null) {
                        long jZzb = zzb(((zzfxgVar2.zzf - zzfxgVar2.zzh) + motionEvent2.getRawX()) - motionEvent2.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzaspVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzfxgVar2.zzg - zzfxgVar2.zzi) + motionEvent2.getRawY()) - motionEvent2.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzaspVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzarwVar.zzJ(zzaspVarZza);
                zzfxh[] zzfxhVarArr = (zzfxh[]) map.get("ro");
                if (zzfxhVarArr != null && zzc(displayMetrics)) {
                    for (int i7 = 0; i7 <= zzfxhVarArr.length - 2; i7++) {
                        zzfxh zzfxhVar = zzfxhVarArr[i7];
                        zzasp zzaspVarZza2 = zzasq.zza();
                        double d8 = zzfxhVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zzaspVarZza2.zza(zzb(d8, displayMetrics));
                        zzaspVarZza2.zzb(zzb(zzfxhVar.zzb, displayMetrics));
                        zzarwVar.zzK((zzasq) zzaspVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
