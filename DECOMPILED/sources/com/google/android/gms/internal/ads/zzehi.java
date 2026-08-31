package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzehi implements zzgoq {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcm zzb;
    final /* synthetic */ zzfcj zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjr zze;
    final /* synthetic */ zzfcu zzf;
    final /* synthetic */ zzehk zzg;

    zzehi(zzehk zzehkVar, long j7, zzfcm zzfcmVar, zzfcj zzfcjVar, String str, zzfjr zzfjrVar, zzfcu zzfcuVar) {
        this.zza = j7;
        this.zzb = zzfcmVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
        this.zze = zzfjrVar;
        this.zzf = zzfcuVar;
        Objects.requireNonNull(zzehkVar);
        this.zzg = zzehkVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: all -> 0x007c, DONT_GENERATE, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i7;
        int i8;
        C3324b1 c3324b1Zzb;
        Integer numValueOf;
        C3324b1 c3324b1Zza;
        int i9;
        C3324b1 c3324b1;
        zzehk zzehkVar = this.zzg;
        long jMo18161c = zzehkVar.zzj().mo18161c() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzegs) {
                i7 = 3;
            } else if (th instanceof CancellationException) {
                i8 = 4;
            } else {
                if (!(th instanceof zzfdj)) {
                    if (th instanceof zzdwz) {
                        i8 = zzfee.zza(th).f13918a == 3 ? 1 : 6;
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbP)).booleanValue() && (th instanceof zzeed) && (c3324b1Zzb = ((zzeed) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(c3324b1Zzb.f13918a);
                            i7 = i8;
                        }
                    } else {
                        i7 = 6;
                    }
                    synchronized (zzehkVar) {
                        try {
                            if (zzehkVar.zzn()) {
                                zzehkVar.zzk().zza(this.zzb, this.zzc, i7, th instanceof zzeed ? (zzeed) th : null, jMo18161c);
                                jMo18161c = jMo18161c;
                            }
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjd)).booleanValue()) {
                                zzfjv zzfjvVarZzl = zzehkVar.zzl();
                                zzfjr zzfjrVar = this.zze;
                                zzfcu zzfcuVar = this.zzf;
                                zzfcj zzfcjVar = this.zzc;
                                zzfjvVarZzl.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzn), zzfcjVar.zzax);
                            }
                            if (zzehkVar.zzp()) {
                                return;
                            }
                            LinkedHashMap linkedHashMapZzm = zzehkVar.zzm();
                            zzfcj zzfcjVar2 = this.zzc;
                            linkedHashMapZzm.put(zzfcjVar2, new zzehj(this.zzd, zzfcjVar2.zzaf, i7, jMo18161c, numValueOf));
                            c3324b1Zza = zzfee.zza(th);
                            i9 = c3324b1Zza.f13918a;
                            if ((i9 != 3 || i9 == 0) && (c3324b1 = c3324b1Zza.f13921d) != null && !c3324b1.f13920c.equals("com.google.android.gms.ads")) {
                            }
                            zzehkVar.zzo().zze(zzfcjVar2, jMo18161c, c3324b1Zza);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i8 = 5;
            }
            numValueOf = null;
            synchronized (zzehkVar) {
                if (zzehkVar.zzn()) {
                    zzehkVar.zzk().zza(this.zzb, this.zzc, i7, th instanceof zzeed ? (zzeed) th : null, jMo18161c);
                    jMo18161c = jMo18161c;
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjd)).booleanValue()) {
                    zzfjv zzfjvVarZzl2 = zzehkVar.zzl();
                    zzfjr zzfjrVar2 = this.zze;
                    zzfcu zzfcuVar2 = this.zzf;
                    zzfcj zzfcjVar3 = this.zzc;
                    zzfjvVarZzl2.zza(zzfjrVar2.zza(zzfcuVar2, zzfcjVar3, zzfcjVar3.zzn), zzfcjVar3.zzax);
                }
                if (zzehkVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm2 = zzehkVar.zzm();
                zzfcj zzfcjVar4 = this.zzc;
                linkedHashMapZzm2.put(zzfcjVar4, new zzehj(this.zzd, zzfcjVar4.zzaf, i7, jMo18161c, numValueOf));
                c3324b1Zza = zzfee.zza(th);
                i9 = c3324b1Zza.f13918a;
                c3324b1Zza = i9 != 3 ? zzfee.zza(new zzeed(13, c3324b1Zza.f13921d)) : zzfee.zza(new zzeed(13, c3324b1Zza.f13921d));
                zzehkVar.zzo().zze(zzfcjVar4, jMo18161c, c3324b1Zza);
            }
        }
        i8 = 2;
        i7 = i8;
        numValueOf = null;
        synchronized (zzehkVar) {
            if (zzehkVar.zzn()) {
                zzehkVar.zzk().zza(this.zzb, this.zzc, i7, th instanceof zzeed ? (zzeed) th : null, jMo18161c);
                jMo18161c = jMo18161c;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjd)).booleanValue()) {
                zzfjv zzfjvVarZzl3 = zzehkVar.zzl();
                zzfjr zzfjrVar3 = this.zze;
                zzfcu zzfcuVar3 = this.zzf;
                zzfcj zzfcjVar5 = this.zzc;
                zzfjvVarZzl3.zza(zzfjrVar3.zza(zzfcuVar3, zzfcjVar5, zzfcjVar5.zzn), zzfcjVar5.zzax);
            }
            if (zzehkVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm3 = zzehkVar.zzm();
            zzfcj zzfcjVar6 = this.zzc;
            linkedHashMapZzm3.put(zzfcjVar6, new zzehj(this.zzd, zzfcjVar6.zzaf, i7, jMo18161c, numValueOf));
            c3324b1Zza = zzfee.zza(th);
            i9 = c3324b1Zza.f13918a;
            if (i9 != 3) {
            }
            zzehkVar.zzo().zze(zzfcjVar6, jMo18161c, c3324b1Zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        long j7;
        zzehk zzehkVar = this.zzg;
        long jMo18161c = zzehkVar.zzj().mo18161c() - this.zza;
        synchronized (zzehkVar) {
            try {
                if (zzehkVar.zzn()) {
                    j7 = jMo18161c;
                    zzehkVar.zzk().zza(this.zzb, this.zzc, 0, null, j7);
                } else {
                    j7 = jMo18161c;
                }
                if (zzehkVar.zzp()) {
                    return;
                }
                zzfcj zzfcjVar = this.zzc;
                if (zzehkVar.zzi(zzfcjVar)) {
                    ((zzehj) zzehkVar.zzm().get(zzfcjVar)).zzd = j7;
                } else {
                    long j8 = j7;
                    j7 = j8;
                    zzehkVar.zzm().put(zzfcjVar, new zzehj(this.zzd, zzfcjVar.zzaf, 0, j8, null));
                }
                zzehkVar.zzo().zzd(zzfcjVar, j7, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
