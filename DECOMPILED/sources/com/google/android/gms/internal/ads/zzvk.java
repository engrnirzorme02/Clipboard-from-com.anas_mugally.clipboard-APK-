package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzvk implements zzzd, zzue {
    final /* synthetic */ zzvt zza;
    private final long zzb;
    private final Uri zzc;
    private final zzgx zzd;
    private final zzvi zze;
    private final zzacx zzf;
    private final zzde zzg;
    private final zzads zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzge zzl;
    private zzaeb zzm;
    private boolean zzn;

    public zzvk(zzvt zzvtVar, Uri uri, zzga zzgaVar, zzvi zzviVar, zzacx zzacxVar, zzde zzdeVar) {
        Objects.requireNonNull(zzvtVar);
        this.zza = zzvtVar;
        this.zzc = uri;
        this.zzd = new zzgx(zzgaVar);
        this.zze = zzviVar;
        this.zzf = zzacxVar;
        this.zzg = zzdeVar;
        this.zzh = new zzads();
        this.zzj = true;
        this.zzb = zzug.zza();
        this.zzl = zzi(0L);
    }

    private final zzge zzi(long j7) {
        zzgd zzgdVar = new zzgd();
        zzgdVar.zza(this.zzc);
        zzgdVar.zzc(j7);
        zzgdVar.zzd(6);
        zzgdVar.zzb(zzvt.zzb);
        return zzgdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(zzef zzefVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzefVar.zzd();
        zzaeb zzaebVar = this.zzm;
        zzaebVar.getClass();
        zzaebVar.zzz(zzefVar, iZzd);
        zzaebVar.zzx(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01d4 */
    @Override // com.google.android.gms.internal.ads.zzzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws Throwable {
        long j7;
        int i7;
        boolean z7;
        int i8;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i9;
        zzi zziVar;
        int i10;
        while (!this.zzi) {
            int i11 = 0;
            try {
                long j8 = this.zzh.zza;
                zzge zzgeVarZzi = zzi(j8);
                this.zzl = zzgeVarZzi;
                zzgx zzgxVar = this.zzd;
                long jZzb = zzgxVar.zzb(zzgeVarZzi);
                if (this.zzi) {
                    zzvi zzviVar = this.zze;
                    if (zzviVar.zzd() != -1) {
                        this.zzh.zza = zzviVar.zzd();
                    }
                    zzgc.zza(this.zzd);
                    return;
                }
                if (jZzb != -1) {
                    jZzb += j8;
                    this.zza.zzH();
                }
                long j9 = jZzb;
                zzvt zzvtVar = this.zza;
                Map mapZzj = zzgxVar.zzj();
                List list = (List) mapZzj.get("icy-br");
                j7 = -1;
                if (list != null) {
                    try {
                        String str4 = (String) list.get(0);
                        try {
                            i7 = Integer.parseInt(str4) * zzbbn.zzq.zzf;
                            if (i7 > 0) {
                                i8 = i7;
                                z7 = true;
                            } else {
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 17);
                                    sb.append("Invalid bitrate: ");
                                    sb.append(str4);
                                    zzds.zzc("IcyHeaders", sb.toString());
                                    z7 = false;
                                    i8 = -1;
                                } catch (NumberFormatException unused) {
                                    zzds.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                    z7 = false;
                                    i8 = i7;
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            i7 = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (i11 != 1) {
                            zzvi zzviVar2 = this.zze;
                            if (zzviVar2.zzd() != j7) {
                                this.zzh.zza = zzviVar2.zzd();
                            }
                        }
                        zzgc.zza(this.zzd);
                        throw th;
                    }
                } else {
                    z7 = false;
                    i8 = -1;
                }
                List list2 = (List) mapZzj.get("icy-genre");
                if (list2 != null) {
                    str = (String) list2.get(0);
                    z7 = true;
                } else {
                    str = null;
                }
                List list3 = (List) mapZzj.get("icy-name");
                if (list3 != null) {
                    str2 = (String) list3.get(0);
                    z7 = true;
                } else {
                    str2 = null;
                }
                List list4 = (List) mapZzj.get("icy-url");
                if (list4 != null) {
                    str3 = (String) list4.get(0);
                    z7 = true;
                } else {
                    str3 = null;
                }
                List list5 = (List) mapZzj.get("icy-pub");
                if (list5 != null) {
                    zEquals = ((String) list5.get(0)).equals("1");
                    z7 = true;
                } else {
                    zEquals = false;
                }
                List list6 = (List) mapZzj.get("icy-metaint");
                if (list6 != null) {
                    String str5 = (String) list6.get(0);
                    try {
                        i10 = Integer.parseInt(str5);
                        if (i10 > 0) {
                            i9 = i10;
                            z7 = true;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 27);
                                sb2.append("Invalid metadata interval: ");
                                sb2.append(str5);
                                zzds.zzc("IcyHeaders", sb2.toString());
                                i9 = -1;
                            } catch (NumberFormatException unused3) {
                                zzds.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i9 = i10;
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i10 = -1;
                    }
                } else {
                    i9 = -1;
                }
                zzvtVar.zzP(z7 ? new zzafw(i8, str, str2, str3, zEquals, i9) : null);
                zzgx zzgxVar2 = this.zzd;
                zzvt zzvtVar2 = this.zza;
                if (zzvtVar2.zzO() == null || zzvtVar2.zzO().zzf == -1) {
                    zziVar = zzgxVar2;
                } else {
                    zzuf zzufVar = new zzuf(zzgxVar2, zzvtVar2.zzO().zzf, this);
                    zzaeb zzaebVarZzx = zzvtVar2.zzx();
                    this.zzm = zzaebVarZzx;
                    zzaebVarZzx.zzu(zzvt.zzc);
                    zziVar = zzufVar;
                }
                zzvi zzviVar3 = this.zze;
                zzviVar3.zza(zziVar, this.zzc, zzgxVar2.zzj(), j8, j9, this.zzf);
                if (zzvtVar2.zzO() != null) {
                    zzviVar3.zzc();
                }
                if (this.zzj) {
                    zzviVar3.zze(j8, this.zzk);
                    this.zzj = false;
                }
                int iZzf = 0;
                while (iZzf == 0) {
                    if (this.zzi) {
                        iZzf = 0;
                        break;
                    }
                    try {
                        zzde zzdeVar = this.zzg;
                        zzdeVar.zzc();
                        iZzf = zzviVar3.zzf(this.zzh);
                        long jZzd = zzviVar3.zzd();
                        if (jZzd > zzvtVar2.zzL() + j8) {
                            zzdeVar.zzb();
                            zzvtVar2.zzN().post(zzvtVar2.zzM());
                            j8 = jZzd;
                        }
                    } catch (InterruptedException unused5) {
                        throw new InterruptedIOException();
                    }
                }
                if (iZzf != 1) {
                    if (zzviVar3.zzd() != -1) {
                        this.zzh.zza = zzviVar3.zzd();
                    }
                    i11 = iZzf;
                }
                zzgc.zza(zzgxVar2);
                if (i11 != 0) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                j7 = -1;
            }
        }
    }

    final /* synthetic */ void zzd(long j7, long j8) {
        this.zzh.zza = j7;
        this.zzk = j8;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzgx zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzge zzh() {
        return this.zzl;
    }
}
