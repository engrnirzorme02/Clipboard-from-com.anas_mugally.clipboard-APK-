package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaej implements zzacu {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaeb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacx zzn;
    private zzaeb zzo;
    private zzaeb zzp;
    private zzadv zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i7 = zzaei.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzeo.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaej() {
        throw null;
    }

    private final boolean zza(zzacv zzacvVar) {
        byte[] bArr = zzc;
        if (zzb(zzacvVar, bArr)) {
            this.zzg = false;
            zzacvVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzb(zzacvVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacvVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzb(zzacv zzacvVar, byte[] bArr) {
        zzacvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacvVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    private final int zzc(zzacv zzacvVar) throws zzas {
        int i7 = this.zzj;
        if (i7 == 0) {
            try {
                zzacvVar.zzl();
                byte[] bArr = this.zze;
                zzacvVar.zzi(bArr, 0, 1);
                byte b7 = bArr[0];
                if ((b7 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b7).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b7);
                    throw zzas.zzb(sb.toString(), null);
                }
                boolean z7 = this.zzg;
                int i8 = (b7 >> 3) & 15;
                if (!z7) {
                    if (!z7) {
                        if (i8 >= 12 && i8 <= 14) {
                        }
                    }
                    String str = true != z7 ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(str.length() + 24 + String.valueOf(i8).length());
                    sb2.append("Illegal AMR ");
                    sb2.append(str);
                    sb2.append(" frame type ");
                    sb2.append(i8);
                    throw zzas.zzb(sb2.toString(), null);
                }
                if (i8 >= 10 && i8 <= 13) {
                    if (!z7) {
                        if (i8 >= 12) {
                        }
                    }
                    if (true != z7) {
                    }
                    StringBuilder sb3 = new StringBuilder(str.length() + 24 + String.valueOf(i8).length());
                    sb3.append("Illegal AMR ");
                    sb3.append(str);
                    sb3.append(" frame type ");
                    sb3.append(i8);
                    throw zzas.zzb(sb3.toString(), null);
                }
                i7 = z7 ? zzb[i8] : zza[i8];
                this.zzi = i7;
                this.zzj = i7;
                int i9 = this.zzk;
                if (i9 == -1) {
                    this.zzk = i7;
                    i9 = i7;
                }
                if (i9 == i7) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZzy = this.zzp.zzy(zzacvVar, i7, true);
        if (iZzy == -1) {
            return -1;
        }
        int i10 = this.zzj - iZzy;
        this.zzj = i10;
        if (i10 > 0) {
            return 0;
        }
        this.zzp.zzx(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        return zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzn = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(0, 1);
        this.zzo = zzaebVarZzu;
        this.zzp = zzaebVarZzu;
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        this.zzo.getClass();
        String str = zzeo.zza;
        if (zzacvVar.zzn() == 0 && !zza(zzacvVar)) {
            throw zzas.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z7 = this.zzg;
            String str2 = true != z7 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z7 ? "audio/3gpp" : "audio/amr-wb";
            int i7 = true != z7 ? 8000 : 16000;
            int i8 = z7 ? zzb[8] : zza[7];
            zzaeb zzaebVar = this.zzo;
            zzs zzsVar = new zzs();
            zzsVar.zzl(str2);
            zzsVar.zzm(str3);
            zzsVar.zzn(i8);
            zzsVar.zzE(1);
            zzsVar.zzF(i7);
            zzaebVar.zzu(zzsVar.zzM());
        }
        int iZzc = zzc(zzacvVar);
        if (this.zzq == null) {
            zzadu zzaduVar = new zzadu(-9223372036854775807L, 0L);
            this.zzq = zzaduVar;
            this.zzn.zzw(zzaduVar);
        }
        return iZzc == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j8;
        this.zzm = 0L;
    }

    public zzaej(int i7) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacr zzacrVar = new zzacr();
        this.zzf = zzacrVar;
        this.zzp = zzacrVar;
    }
}
