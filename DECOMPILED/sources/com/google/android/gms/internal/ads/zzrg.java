package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrg extends zzsz implements zzkm {
    private final Context zzb;
    private final zzpu zzc;
    private final zzqc zzd;
    private final zzsm zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzu zzi;
    private zzu zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrg(Context context, zzso zzsoVar, zztb zztbVar, boolean z7, Handler handler, zzpv zzpvVar, zzqc zzqcVar) {
        super(1, zzsoVar, zztbVar, false, 44100.0f);
        byte[] bArr = null;
        zzsm zzsmVar = Build.VERSION.SDK_INT >= 35 ? new zzsm(zzsl.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqcVar;
        this.zze = zzsmVar;
        this.zzo = -1000;
        this.zzc = new zzpu(handler, zzpvVar);
        this.zzq = -9223372036854775807L;
        zzqcVar.zza(new zzrf(this, bArr));
    }

    private static List zzbd(zztb zztbVar, zzu zzuVar, boolean z7, zzqc zzqcVar) {
        zzst zzstVarZza;
        if (zzuVar.zzo == null) {
            return zzgjz.zzi();
        }
        return (!zzqcVar.zzd(zzuVar) || (zzstVarZza = zztl.zza()) == null) ? zztl.zzc(zztbVar, zzuVar, false, false) : zzgjz.zzj(zzstVarZza);
    }

    private final int zzbe(zzst zzstVar, zzu zzuVar) {
        "OMX.google.raw.decoder".equals(zzstVar.zza);
        return zzuVar.zzp;
    }

    private final void zzbf() {
        long jZzg = this.zzd.zzg(zzY());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzA(long j7, boolean z7) {
        super.zzA(j7, z7);
        this.zzd.zzz();
        this.zzk = j7;
        this.zzq = -9223372036854775807L;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzB() {
        this.zzd.zzi();
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzC() {
        zzbf();
        this.zzp = false;
        this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = -9223372036854775807L;
        try {
            this.zzd.zzz();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzsz) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzE() {
        this.zzn = false;
        this.zzq = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzF() {
        zzsm zzsmVar;
        this.zzd.zzB();
        if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
            return;
        }
        zzsmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        return super.zzY() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzab(zztb zztbVar, zzu zzuVar) {
        int i7;
        boolean z7;
        String str = zzuVar.zzo;
        if (!zzar.zza(str)) {
            return 128;
        }
        int i8 = zzuVar.zzN;
        boolean zZzbb = zzsz.zzbb(zzuVar);
        int i9 = 1;
        if (!zZzbb || (i8 != 0 && zztl.zza() == null)) {
            i7 = 0;
        } else {
            zzqc zzqcVar = this.zzd;
            zzpg zzpgVarZzf = zzqcVar.zzf(zzuVar);
            if (zzpgVarZzf.zzb) {
                i7 = true != zzpgVarZzf.zzc ? 512 : 1536;
                if (zzpgVarZzf.zzd) {
                    i7 |= 2048;
                }
            } else {
                i7 = 0;
            }
            if (zzqcVar.zzd(zzuVar)) {
                return i7 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzuVar)) {
            zzqc zzqcVar2 = this.zzd;
            if (zzqcVar2.zzd(zzeo.zzy(2, zzuVar.zzG, zzuVar.zzH))) {
                List listZzbd = zzbd(zztbVar, zzuVar, false, zzqcVar2);
                if (!listZzbd.isEmpty()) {
                    if (zZzbb) {
                        zzst zzstVar = (zzst) listZzbd.get(0);
                        boolean zZzc = zzstVar.zzc(zzuVar);
                        if (!zZzc) {
                            int i10 = 1;
                            while (true) {
                                if (i10 >= listZzbd.size()) {
                                    z7 = true;
                                    break;
                                }
                                zzst zzstVar2 = (zzst) listZzbd.get(i10);
                                if (zzstVar2.zzc(zzuVar)) {
                                    z7 = false;
                                    zZzc = true;
                                    zzstVar = zzstVar2;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            z7 = true;
                            break;
                        }
                        int i11 = true != zZzc ? 3 : 4;
                        int i12 = 8;
                        if (zZzc && zzstVar.zze(zzuVar)) {
                            i12 = 16;
                        }
                        return i11 | i12 | 32 | (true != zzstVar.zzg ? 0 : 64) | (true != z7 ? 0 : 128) | i7;
                    }
                    i9 = 2;
                }
            }
        }
        return i9 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzac(zztb zztbVar, zzu zzuVar, boolean z7) {
        return zztl.zze(zzbd(zztbVar, zzuVar, false, this.zzd), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzad(zzu zzuVar) {
        zzJ();
        return this.zzd.zzd(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f7) {
        zzu[] zzuVarArrZzI = zzI();
        int length = zzuVarArrZzI.length;
        int iZzbe = zzbe(zzstVar, zzuVar);
        if (length != 1) {
            for (zzu zzuVar2 : zzuVarArrZzI) {
                if (zzstVar.zzf(zzuVar, zzuVar2).zzd != 0) {
                    iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVar2));
                }
            }
        }
        this.zzf = iZzbe;
        String str = zzstVar.zza;
        int i7 = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzstVar.zzc;
        int i8 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i9 = zzuVar.zzG;
        mediaFormat.setInteger("channel-count", i9);
        int i10 = zzuVar.zzH;
        mediaFormat.setInteger("sample-rate", i10);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        zzdv.zzb(mediaFormat, "max-input-size", i8);
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        String str3 = zzuVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZze = zzdc.zze(zzuVar);
            if (pairZze != null) {
                zzdv.zzb(mediaFormat, "profile", ((Integer) pairZze.first).intValue());
                zzdv.zzb(mediaFormat, "level", ((Integer) pairZze.second).intValue());
            }
            if (i7 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzeo.zzy(4, i9, i10)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzstVar.zzb) || "audio/raw".equals(str3)) ? null : zzuVar;
        return zzsn.zza(zzstVar, mediaFormat, zzuVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i7;
        int i8;
        zzhs zzhsVarZzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i9 = zzhsVarZzf.zze;
        if (zzaA(zzuVar2)) {
            i9 |= 32768;
        }
        if (zzbe(zzstVar, zzuVar2) > this.zzf) {
            i9 |= 64;
        }
        String str = zzstVar.zza;
        if (i9 != 0) {
            i8 = 0;
            i7 = i9;
        } else {
            i7 = 0;
            i8 = zzhsVarZzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i8, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final long zzag(long j7, long j8, boolean z7) {
        long j9 = this.zzq;
        if (!this.zzp) {
            return (j9 != -9223372036854775807L || super.zzY()) ? 1000000L : 10000L;
        }
        long jZzv = this.zzd.zzv();
        if (j9 == -9223372036854775807L || jZzv == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzv, this.zzq - j7) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzeo.zzq(zzL().zzb()) - j8));
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzah(float f7, zzu zzuVar, zzu[] zzuVarArr) {
        int iMax = -1;
        for (zzu zzuVar2 : zzuVarArr) {
            int i7 = zzuVar2.zzH;
            if (i7 != -1) {
                iMax = Math.max(iMax, i7);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f7;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(String str, zzsn zzsnVar, long j7, long j8) {
        this.zzc.zzb(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzal(zzkh zzkhVar) {
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzi = zzuVar;
        zzhs zzhsVarZzal = super.zzal(zzkhVar);
        this.zzc.zzc(zzuVar, zzhsVarZzal);
        return zzhsVarZzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzam(zzu zzuVar, MediaFormat mediaFormat) throws zzhz {
        int iZzz;
        int i7;
        zzu zzuVar2 = this.zzj;
        int[] iArr = null;
        boolean z7 = true;
        if (zzuVar2 != null) {
            zzuVar = zzuVar2;
        } else if (zzaD() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzuVar.zzo)) {
                iZzz = zzuVar.zzI;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZzz = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZzz = mediaFormat.containsKey("v-bits-per-sample") ? zzeo.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            zzs zzsVar = new zzs();
            zzsVar.zzm("audio/raw");
            zzsVar.zzG(iZzz);
            zzsVar.zzH(zzuVar.zzJ);
            zzsVar.zzI(zzuVar.zzK);
            zzsVar.zzk(zzuVar.zzl);
            zzsVar.zza(zzuVar.zza);
            zzsVar.zzc(zzuVar.zzb);
            zzsVar.zzd(zzuVar.zzc);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zzg(zzuVar.zzf);
            zzsVar.zzE(mediaFormat.getInteger("channel-count"));
            zzsVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzu zzuVarZzM = zzsVar.zzM();
            if (this.zzg && zzuVarZzM.zzG == 6 && (i7 = zzuVar.zzG) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.zzh) {
                int i9 = zzuVarZzM.zzG;
                if (i9 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i9 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i9 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i9 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i9 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzuVar = zzuVarZzM;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                if (zzaC()) {
                    zzJ();
                }
                if (i10 < 29) {
                    z7 = false;
                }
                zzghc.zzh(z7);
            }
            this.zzd.zzh(zzuVar, 0, iArr);
        } catch (zzpx e7) {
            throw zzN(e7, e7.zza, false, 5001);
        }
    }

    protected final void zzan() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzao() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j7, long j8, zzsq zzsqVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, zzu zzuVar) throws zzhz {
        byteBuffer.getClass();
        this.zzq = -9223372036854775807L;
        if (this.zzj != null && (i8 & 2) != 0) {
            zzsqVar.getClass();
            zzsqVar.zzc(i7, false);
            return true;
        }
        if (z7) {
            if (zzsqVar != null) {
                zzsqVar.zzc(i7, false);
            }
            ((zzsz) this).zza.zzf += i9;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j9, i9)) {
                this.zzq = j9;
                return false;
            }
            if (zzsqVar != null) {
                zzsqVar.zzc(i7, false);
            }
            ((zzsz) this).zza.zze += i9;
            return true;
        } catch (zzpy e7) {
            zzu zzuVar2 = this.zzi;
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e7, zzuVar2, e7.zzb, 5001);
        } catch (zzqb e8) {
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e8, zzuVar, e8.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaq() throws zzhz {
        try {
            this.zzd.zzl();
            if (zzaT() != -9223372036854775807L) {
                this.zzq = zzaT();
            }
        } catch (zzqb e7) {
            throw zzN(e7, e7.zzc, e7.zzb, true != zzaC() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzar(zzhg zzhgVar) {
        zzu zzuVar;
        if (Build.VERSION.SDK_INT < 29 || (zzuVar = zzhgVar.zza) == null || !Objects.equals(zzuVar.zzo, "audio/opus") || !zzaC()) {
            return;
        }
        ByteBuffer byteBuffer = zzhgVar.zzf;
        byteBuffer.getClass();
        zzu zzuVar2 = zzhgVar.zza;
        zzuVar2.getClass();
        int i7 = zzuVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzw(i7, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    final /* synthetic */ zzpu zzav() {
        return this.zzc;
    }

    final /* synthetic */ zzsm zzaw() {
        return this.zze;
    }

    final /* synthetic */ void zzax(boolean z7) {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    public final zzkm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (zze() == 2) {
            zzbf();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        boolean z7 = this.zzn;
        this.zzn = false;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        this.zzd.zzo(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i7, Object obj) {
        zzsm zzsmVar;
        if (i7 == 2) {
            zzqc zzqcVar = this.zzd;
            obj.getClass();
            zzqcVar.zzx(((Float) obj).floatValue());
            return;
        }
        if (i7 == 3) {
            zzc zzcVar = (zzc) obj;
            zzqc zzqcVar2 = this.zzd;
            zzcVar.getClass();
            zzqcVar2.zzr(zzcVar);
            return;
        }
        if (i7 == 6) {
            zzd zzdVar = (zzd) obj;
            zzqc zzqcVar3 = this.zzd;
            zzdVar.getClass();
            zzqcVar3.zzt(zzdVar);
            return;
        }
        if (i7 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsq zzsqVarZzaD = zzaD();
            if (zzsqVarZzaD == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzsqVarZzaD.zzo(bundle);
            return;
        }
        if (i7 == 9) {
            zzqc zzqcVar4 = this.zzd;
            obj.getClass();
            zzqcVar4.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i7 != 10) {
                super.zzx(i7, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
                return;
            }
            zzsmVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzy(boolean z7, boolean z8) {
        super.zzy(z7, z8);
        this.zzc.zza(((zzsz) this).zza);
        zzJ();
        zzqc zzqcVar = this.zzd;
        zzqcVar.zzb(zzK());
        zzqcVar.zzc(zzL());
    }
}
