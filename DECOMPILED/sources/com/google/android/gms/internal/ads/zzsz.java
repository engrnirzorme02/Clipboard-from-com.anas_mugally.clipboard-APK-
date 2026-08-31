package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsz extends zzhq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque zzA;
    private zzsw zzB;
    private zzst zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhr zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsy zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzso zzc;
    private final zztb zzd;
    private final float zze;
    private final zzhg zzf;
    private final zzhg zzg;
    private final zzhg zzh;
    private final zzsh zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrh zzl;
    private zzu zzm;
    private zzu zzn;
    private zzrn zzo;
    private zzrn zzp;
    private zzlk zzq;
    private MediaCrypto zzr;
    private long zzs;
    private float zzt;
    private float zzu;
    private zzsq zzv;
    private zzu zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzsz(int i7, zzso zzsoVar, zztb zztbVar, boolean z7, float f7) {
        super(i7);
        this.zzc = zzsoVar;
        zztbVar.getClass();
        this.zzd = zztbVar;
        this.zze = f7;
        this.zzf = new zzhg(0, 0);
        this.zzg = new zzhg(0, 0);
        this.zzh = new zzhg(2, 0);
        zzsh zzshVar = new zzsh();
        this.zzi = zzshVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzt = 1.0f;
        this.zzu = 1.0f;
        this.zzs = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzsy.zza;
        zzshVar.zzj(0);
        zzshVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrh();
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzhr();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzan() {
        this.zzR = false;
        zzas();
    }

    private final void zzas() {
        zzav();
        this.zzT = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzS = false;
        this.zzl.zzb();
    }

    private final boolean zzat() {
        if (this.zzv == null) {
            return false;
        }
        if (zzaJ()) {
            zzaH();
            return true;
        }
        if (zzaK()) {
            zzau();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzau() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar == null) {
                throw null;
            }
            zzsqVar.zzj();
            zzaM();
        } catch (Throwable th) {
            zzaM();
            throw th;
        }
    }

    private final void zzav() {
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzaw(int i7) throws zzhz {
        zzkh zzkhVarZzH = zzH();
        zzhg zzhgVar = this.zzf;
        zzhgVar.zza();
        int iZzO = zzO(zzkhVarZzH, zzhgVar, i7 | 4);
        if (iZzO == -5) {
            zzal(zzkhVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzhgVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbj();
        return false;
    }

    private final boolean zzax(long j7) {
        return this.zzs == -9223372036854775807L || zzL().zzb() - j7 < this.zzs;
    }

    protected static boolean zzbb(zzu zzuVar) {
        return zzuVar.zzN == 0;
    }

    private final boolean zzbd() {
        return this.zzN >= 0;
    }

    private final void zzbe() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzbf() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final boolean zzbg(zzu zzuVar) throws zzhz {
        if (this.zzv != null && this.zzX != 3 && zze() != 0) {
            float f7 = this.zzu;
            zzuVar.getClass();
            float fZzah = zzah(f7, zzuVar, zzI());
            float f8 = this.zzz;
            if (f8 != fZzah) {
                if (fZzah == -1.0f) {
                    zzbi();
                    return false;
                }
                if (f8 != -1.0f || fZzah > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzah);
                    zzsq zzsqVar = this.zzv;
                    zzsqVar.getClass();
                    zzsqVar.zzo(bundle);
                    this.zzz = fZzah;
                }
            }
        }
        return true;
    }

    private final boolean zzbh() {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzbl();
        }
        return true;
    }

    private final void zzbi() throws zzhz {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaH();
            zzaz();
        }
    }

    private final void zzbj() throws zzhz {
        int i7 = this.zzX;
        if (i7 == 1) {
            zzau();
            return;
        }
        if (i7 == 2) {
            zzau();
            zzbl();
        } else if (i7 != 3) {
            this.zzae = true;
            zzaq();
        } else {
            zzaH();
            zzaz();
        }
    }

    private final void zzbk(zzsy zzsyVar) {
        this.zzag = zzsyVar;
        if (zzsyVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzbl() {
        zzrn zzrnVar = this.zzp;
        zzrnVar.getClass();
        this.zzo = zzrnVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final boolean zzbm(long j7, long j8) {
        if (j8 >= j7) {
            return false;
        }
        zzu zzuVar = this.zzn;
        return (zzuVar != null && Objects.equals(zzuVar.zzo, "audio/opus") && zzadr.zzf(j7, j8)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzA(long j7, boolean z7) {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            zzas();
        } else {
            zzaI();
        }
        zzek zzekVar = this.zzag.zze;
        if (zzekVar.zzc() > 0) {
            this.zzaf = true;
        }
        zzekVar.zzb();
        this.zzk.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzD() {
        this.zzm = null;
        zzbk(zzsy.zza);
        this.zzk.clear();
        if (this.zzR) {
            zzan();
        } else {
            zzat();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzE() {
        try {
            zzan();
            zzaH();
        } finally {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final long zzT(long j7, long j8) {
        return zzag(j7, j8, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public void zzU(float f7, float f8) throws zzhz {
        this.zzt = f7;
        this.zzu = f8;
        zzbg(this.zzw);
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0359 A[LOOP:0: B:126:0x01ec->B:230:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x0570  */
    /* JADX WARN: Code duplicated, block: B:370:0x0577  */
    /* JADX WARN: Code duplicated, block: B:374:0x058a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0595  */
    /* JADX WARN: Code duplicated, block: B:379:0x0598  */
    /* JADX WARN: Code duplicated, block: B:382:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:383:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:409:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // com.google.android.gms.internal.ads.zzll
    public void zzW(long j7, long j8) throws Throwable {
        boolean z7;
        ?? r12;
        ?? r13;
        boolean z8;
        ?? r7;
        zzss zzssVarZzaO;
        int i7;
        StackTraceElement[] stackTrace;
        boolean z9;
        boolean z10;
        Throwable th;
        long j9;
        boolean z11;
        boolean z12;
        ByteBuffer byteBuffer;
        int i8;
        MediaCodec.BufferInfo bufferInfo;
        long j10;
        int i9;
        long j11;
        boolean z13 = true;
        try {
            try {
                if (this.zzae) {
                    zzaq();
                    return;
                }
                int i10 = 2;
                if (this.zzm == null && !zzaw(2)) {
                    return;
                }
                zzaz();
                byte b7 = -5;
                ?? r8 = 0;
                try {
                    try {
                        try {
                            try {
                                if (this.zzR) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzghc.zzh(this.zzae ^ z13);
                                                zzsh zzshVar = this.zzi;
                                                try {
                                                    if (zzshVar.zzp()) {
                                                        ByteBuffer byteBuffer2 = zzshVar.zzc;
                                                        int i11 = this.zzN;
                                                        int iZzo = zzshVar.zzo();
                                                        long j12 = zzshVar.zze;
                                                        boolean zZzbm = zzbm(zzG(), zzshVar.zzn());
                                                        boolean zZzb = zzshVar.zzb();
                                                        zzu zzuVar = this.zzn;
                                                        if (zzuVar == null) {
                                                            throw r8;
                                                        }
                                                        if (zzap(j7, j8, null, byteBuffer2, i11, 0, iZzo, j12, zZzbm, zZzb, zzuVar)) {
                                                            zzaU(zzshVar.zzn());
                                                            zzshVar.zza();
                                                            r8 = 0;
                                                        } else {
                                                            z13 = true;
                                                        }
                                                        z10 = false;
                                                        break;
                                                    }
                                                    r8 = r8;
                                                    if (!this.zzad) {
                                                        z13 = true;
                                                        if (this.zzS) {
                                                            zzghc.zzh(zzshVar.zzq(this.zzh));
                                                            z10 = false;
                                                            this.zzS = false;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (this.zzT) {
                                                            if (!zzshVar.zzp()) {
                                                                zzan();
                                                                this.zzT = z10;
                                                                zzaz();
                                                                if (!this.zzR) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        zzghc.zzh(!this.zzad);
                                                        zzkh zzkhVarZzH = zzH();
                                                        zzhg zzhgVar = this.zzh;
                                                        zzhgVar.zza();
                                                        while (true) {
                                                            zzhgVar.zza();
                                                            int iZzO = zzO(zzkhVarZzH, zzhgVar, z10 ? 1 : 0);
                                                            if (iZzO == -5) {
                                                                zzal(zzkhVarZzH);
                                                                break;
                                                            }
                                                            if (iZzO != -4) {
                                                                if (!zzdb()) {
                                                                    break;
                                                                }
                                                                this.zzac = this.zzab;
                                                                break;
                                                            }
                                                            if (zzhgVar.zzb()) {
                                                                this.zzad = true;
                                                                this.zzac = this.zzab;
                                                                break;
                                                            }
                                                            long jMax = Math.max(this.zzab, zzhgVar.zze);
                                                            this.zzab = jMax;
                                                            if (zzdb() || this.zzg.zzd()) {
                                                                this.zzac = jMax;
                                                            }
                                                            if (this.zzaf) {
                                                                zzu zzuVar2 = this.zzm;
                                                                if (zzuVar2 == null) {
                                                                    throw r8;
                                                                }
                                                                this.zzn = zzuVar2;
                                                                if (Objects.equals(zzuVar2.zzo, "audio/opus") && !this.zzn.zzr.isEmpty()) {
                                                                    int iZze = zzadr.zze((byte[]) this.zzn.zzr.get(z10 ? 1 : 0));
                                                                    zzs zzsVarZza = this.zzn.zza();
                                                                    zzsVarZza.zzH(iZze);
                                                                    this.zzn = zzsVarZza.zzM();
                                                                }
                                                                zzam(this.zzn, r8);
                                                                this.zzaf = z10;
                                                            }
                                                            zzhgVar.zzl();
                                                            zzu zzuVar3 = this.zzn;
                                                            if (zzuVar3 != null && Objects.equals(zzuVar3.zzo, "audio/opus")) {
                                                                if (zzhgVar.zze()) {
                                                                    zzhgVar.zza = this.zzn;
                                                                    zzar(zzhgVar);
                                                                }
                                                                if (zzadr.zzf(zzG(), zzhgVar.zze)) {
                                                                    this.zzl.zza(zzhgVar, this.zzn.zzr);
                                                                }
                                                            }
                                                            if (zzshVar.zzp()) {
                                                                long jZzG = zzG();
                                                                if (zzbm(jZzG, zzshVar.zzn()) == zzbm(jZzG, zzhgVar.zze)) {
                                                                }
                                                                this.zzS = true;
                                                                break;
                                                            }
                                                            if (!zzshVar.zzq(zzhgVar)) {
                                                                this.zzS = true;
                                                                break;
                                                            }
                                                        }
                                                        if (zzshVar.zzp()) {
                                                            zzshVar.zzl();
                                                        }
                                                        if (!zzshVar.zzp() && !this.zzad && !this.zzT) {
                                                            break;
                                                        }
                                                    } else {
                                                        z13 = true;
                                                        this.zzae = true;
                                                        z10 = false;
                                                        break;
                                                    }
                                                } catch (IllegalStateException e7) {
                                                    e = e7;
                                                    z13 = true;
                                                    b7 = 0;
                                                    z7 = z13;
                                                    r13 = b7;
                                                    z8 = e instanceof MediaCodec.CodecException;
                                                    if (!z8) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzak(e);
                                                    if (z8) {
                                                        r7 = r13;
                                                    } else {
                                                        r7 = r13;
                                                    }
                                                    if (r7 != 0) {
                                                        zzaH();
                                                    }
                                                    zzssVarZzaO = zzaO(e, this.zzC);
                                                    if (zzssVarZzaO.zza == 1101) {
                                                        i7 = 4006;
                                                    } else {
                                                        i7 = 4003;
                                                    }
                                                    throw zzN(zzssVarZzaO, this.zzm, r7, i7);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e8) {
                                            e = e8;
                                            b7 = 0;
                                            r12 = b7;
                                            throw zzN(e, this.zzm, r12, zzeo.zzF(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e9) {
                                        e = e9;
                                    }
                                } else {
                                    byte b8 = -5;
                                    Throwable th2 = null;
                                    boolean z14 = false;
                                    if (this.zzv != null) {
                                        long jZzb = zzL().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j13 = jZzb;
                                        while (true) {
                                            zzsq zzsqVar = this.zzv;
                                            if (zzsqVar == null) {
                                                throw th2;
                                            }
                                            try {
                                                if (!zzbd()) {
                                                    try {
                                                        MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                        int iZzf = zzsqVar.zzf(bufferInfo2);
                                                        if (iZzf >= 0) {
                                                            th = th2;
                                                            bufferInfo2.presentationTimeUs -= this.zzal;
                                                            if (!this.zzH) {
                                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                                    zzbj();
                                                                    j9 = j13;
                                                                    break;
                                                                }
                                                                this.zzN = iZzf;
                                                                ByteBuffer byteBufferZzi = zzsqVar.zzi(iZzf);
                                                                this.zzO = byteBufferZzi;
                                                                if (byteBufferZzi != null) {
                                                                    byteBufferZzi.position(bufferInfo2.offset);
                                                                    this.zzO.limit(bufferInfo2.offset + bufferInfo2.size);
                                                                }
                                                                zzu zzuVar4 = (zzu) this.zzag.zze.zze(bufferInfo2.presentationTimeUs);
                                                                if (zzuVar4 == null && this.zzai && this.zzx != null) {
                                                                    zzuVar4 = (zzu) this.zzag.zze.zzd();
                                                                }
                                                                if (zzuVar4 != null) {
                                                                    this.zzn = zzuVar4;
                                                                } else if (this.zzy && this.zzn != null) {
                                                                }
                                                                zzu zzuVar5 = this.zzn;
                                                                if (zzuVar5 == null) {
                                                                    throw th;
                                                                }
                                                                zzam(zzuVar5, this.zzx);
                                                                this.zzy = z14;
                                                                this.zzai = z14;
                                                            } else {
                                                                this.zzH = z14;
                                                                zzsqVar.zzc(iZzf, z14);
                                                                j9 = j13;
                                                                if (!zzax(j9)) {
                                                                    break;
                                                                    break;
                                                                }
                                                                j13 = j9;
                                                                th2 = th;
                                                                z13 = true;
                                                                i10 = 2;
                                                                z14 = false;
                                                                b8 = -5;
                                                            }
                                                        } else {
                                                            if (iZzf != -2) {
                                                                if (this.zzI && (this.zzad || this.zzW == i10)) {
                                                                    zzbj();
                                                                }
                                                                long j14 = this.zzJ;
                                                                if (j14 != -9223372036854775807L && j14 + 100 < zzL().zza()) {
                                                                    zzbj();
                                                                }
                                                                th = th2;
                                                                j9 = j13;
                                                                break;
                                                            }
                                                            this.zzaa = z13;
                                                            zzsq zzsqVar2 = this.zzv;
                                                            if (zzsqVar2 == null) {
                                                                throw th2;
                                                            }
                                                            MediaFormat mediaFormatZzg = zzsqVar2.zzg();
                                                            if (this.zzD != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                                                this.zzH = z13;
                                                            } else {
                                                                this.zzx = mediaFormatZzg;
                                                                this.zzy = z13;
                                                            }
                                                            th = th2;
                                                            j9 = j13;
                                                            if (!zzax(j9)) {
                                                                break;
                                                            }
                                                            j13 = j9;
                                                            th2 = th;
                                                            z13 = true;
                                                            i10 = 2;
                                                            z14 = false;
                                                            b8 = -5;
                                                        }
                                                    } catch (IllegalStateException e10) {
                                                        e = e10;
                                                        z9 = z14;
                                                        z7 = true;
                                                        r13 = z9;
                                                    }
                                                    z8 = e instanceof MediaCodec.CodecException;
                                                    if (!z8) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0 || !stackTrace[r13].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzak(e);
                                                    if (z8 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                        r7 = r13;
                                                    } else {
                                                        r7 = z7;
                                                    }
                                                    if (r7 != 0) {
                                                        zzaH();
                                                    }
                                                    zzssVarZzaO = zzaO(e, this.zzC);
                                                    if (zzssVarZzaO.zza == 1101) {
                                                        i7 = 4006;
                                                    } else {
                                                        i7 = 4003;
                                                    }
                                                    throw zzN(zzssVarZzaO, this.zzm, r7, i7);
                                                }
                                                th = th2;
                                                zzu zzuVar6 = this.zzn;
                                                if (zzuVar6 == null) {
                                                    throw th;
                                                }
                                                if (zzap(j7, j8, zzsqVar, byteBuffer, i8, i9, 1, j11, z11, z12, zzuVar6)) {
                                                    zzaU(bufferInfo.presentationTimeUs);
                                                    boolean z15 = (bufferInfo.flags & 4) != 0;
                                                    if (!z15 && this.zzZ && this.zzQ) {
                                                        this.zzJ = zzL().zza();
                                                    }
                                                    zzbf();
                                                    if (z15) {
                                                        zzbj();
                                                    } else {
                                                        j9 = j10;
                                                        if (!zzax(j9)) {
                                                            break;
                                                            break;
                                                        }
                                                        j13 = j9;
                                                        th2 = th;
                                                        z13 = true;
                                                        i10 = 2;
                                                        z14 = false;
                                                        b8 = -5;
                                                    }
                                                }
                                                j9 = j10;
                                                break;
                                            } catch (IllegalStateException e11) {
                                                e = e11;
                                                r13 = z14;
                                                z7 = true;
                                            }
                                            z11 = (this.zzak || this.zzj.presentationTimeUs < zzG()) ? true : z14;
                                            this.zzP = z11;
                                            long j15 = this.zzac;
                                            z12 = (j15 == -9223372036854775807L || j15 > this.zzj.presentationTimeUs) ? z14 : true;
                                            this.zzQ = z12;
                                            byteBuffer = this.zzO;
                                            i8 = this.zzN;
                                            bufferInfo = this.zzj;
                                            j10 = j13;
                                            i9 = bufferInfo.flags;
                                            j11 = bufferInfo.presentationTimeUs;
                                        }
                                        do {
                                            zzsq zzsqVar3 = this.zzv;
                                            if (zzsqVar3 != null && this.zzW != 2 && !this.zzad) {
                                                if (this.zzM < 0) {
                                                    int iZze2 = zzsqVar3.zze();
                                                    this.zzM = iZze2;
                                                    if (iZze2 >= 0) {
                                                        zzhg zzhgVar2 = this.zzg;
                                                        zzhgVar2.zzc = zzsqVar3.zzh(iZze2);
                                                        zzhgVar2.zza();
                                                    }
                                                }
                                                z7 = true;
                                                if (this.zzW == 1) {
                                                    if (!this.zzI) {
                                                        this.zzZ = true;
                                                        zzsqVar3.zza(this.zzM, 0, 0, 0L, 4);
                                                        zzbe();
                                                    }
                                                    this.zzW = 2;
                                                    break;
                                                }
                                                try {
                                                    if (this.zzG) {
                                                        this.zzG = false;
                                                        ByteBuffer byteBuffer3 = this.zzg.zzc;
                                                        if (byteBuffer3 == null) {
                                                            throw th;
                                                        }
                                                        byteBuffer3.put(zzb);
                                                        zzsqVar3.zza(this.zzM, 0, 38, 0L, 0);
                                                        zzbe();
                                                        this.zzY = true;
                                                    } else {
                                                        r12 = 0;
                                                        r13 = 0;
                                                        if (this.zzV == 1) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                zzu zzuVar7 = this.zzw;
                                                                if (zzuVar7 == null) {
                                                                    throw th;
                                                                }
                                                                if (i12 >= zzuVar7.zzr.size()) {
                                                                    this.zzV = 2;
                                                                    break;
                                                                }
                                                                byte[] bArr = (byte[]) this.zzw.zzr.get(i12);
                                                                ByteBuffer byteBuffer4 = this.zzg.zzc;
                                                                if (byteBuffer4 == null) {
                                                                    throw th;
                                                                }
                                                                byteBuffer4.put(bArr);
                                                                i12++;
                                                            }
                                                        }
                                                        zzhg zzhgVar3 = this.zzg;
                                                        ByteBuffer byteBuffer5 = zzhgVar3.zzc;
                                                        if (byteBuffer5 == null) {
                                                            throw th;
                                                        }
                                                        int iPosition = byteBuffer5.position();
                                                        zzkh zzkhVarZzH2 = zzH();
                                                        try {
                                                            int iZzO2 = zzO(zzkhVarZzH2, zzhgVar3, 0);
                                                            if (iZzO2 == -3) {
                                                                if (!zzdb()) {
                                                                    break;
                                                                }
                                                                this.zzac = this.zzab;
                                                                break;
                                                            }
                                                            if (iZzO2 == -5) {
                                                                if (this.zzV == 2) {
                                                                    this.zzg.zza();
                                                                    this.zzV = 1;
                                                                }
                                                                zzal(zzkhVarZzH2);
                                                            } else {
                                                                zzhg zzhgVar4 = this.zzg;
                                                                if (zzhgVar4.zzb()) {
                                                                    this.zzac = this.zzab;
                                                                    if (this.zzV == 2) {
                                                                        zzhgVar4.zza();
                                                                        this.zzV = 1;
                                                                    }
                                                                    this.zzad = true;
                                                                    if (!this.zzY) {
                                                                        zzbj();
                                                                        break;
                                                                    } else {
                                                                        if (!this.zzI) {
                                                                            this.zzZ = true;
                                                                            zzsqVar3.zza(this.zzM, 0, 0, 0L, 4);
                                                                            zzbe();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (!this.zzY && !zzhgVar4.zzc()) {
                                                                    zzhgVar4.zza();
                                                                    if (this.zzV == 2) {
                                                                        this.zzV = 1;
                                                                    }
                                                                } else if (!zzaS(zzhgVar4)) {
                                                                    boolean zZzk = zzhgVar4.zzk();
                                                                    if (zZzk) {
                                                                        zzhgVar4.zzb.zzc(iPosition);
                                                                    }
                                                                    long j16 = zzhgVar4.zze;
                                                                    if (this.zzaf) {
                                                                        ArrayDeque arrayDeque = this.zzk;
                                                                        if (arrayDeque.isEmpty()) {
                                                                            zzek zzekVar = this.zzag.zze;
                                                                            zzu zzuVar8 = this.zzm;
                                                                            if (zzuVar8 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzekVar.zza(j16, zzuVar8);
                                                                        } else {
                                                                            zzek zzekVar2 = ((zzsy) arrayDeque.peekLast()).zze;
                                                                            zzu zzuVar9 = this.zzm;
                                                                            if (zzuVar9 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzekVar2.zza(j16, zzuVar9);
                                                                        }
                                                                        this.zzaf = false;
                                                                    }
                                                                    long jMax2 = Math.max(this.zzab, j16);
                                                                    this.zzab = jMax2;
                                                                    if (zzdb() || zzhgVar4.zzd()) {
                                                                        this.zzac = jMax2;
                                                                    }
                                                                    zzhgVar4.zzl();
                                                                    if (zzhgVar4.zze()) {
                                                                        zzar(zzhgVar4);
                                                                    }
                                                                    if (this.zzak) {
                                                                        long j17 = this.zzab;
                                                                        if (j16 <= j17) {
                                                                            this.zzal += (j17 - j16) + 1;
                                                                        }
                                                                        this.zzab = j16;
                                                                        this.zzak = false;
                                                                    }
                                                                    zzaQ(zzhgVar4);
                                                                    int iZzaR = zzaR(zzhgVar4);
                                                                    long j18 = j16 + this.zzal;
                                                                    if (zZzk) {
                                                                        zzsqVar3.zzb(this.zzM, 0, zzhgVar4.zzb, j18, iZzaR);
                                                                    } else {
                                                                        int i13 = this.zzM;
                                                                        ByteBuffer byteBuffer6 = zzhgVar4.zzc;
                                                                        if (byteBuffer6 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzsqVar3.zza(i13, 0, byteBuffer6.limit(), j18, iZzaR);
                                                                    }
                                                                    zzbe();
                                                                    this.zzY = true;
                                                                    this.zzV = 0;
                                                                    this.zza.zzc++;
                                                                }
                                                            }
                                                        } catch (zzhf e12) {
                                                            zzak(e12);
                                                            zzaw(0);
                                                            zzau();
                                                        }
                                                    }
                                                } catch (IllegalStateException e13) {
                                                    e = e13;
                                                    r13 = 0;
                                                    z8 = e instanceof MediaCodec.CodecException;
                                                    if (!z8) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzak(e);
                                                    if (z8) {
                                                        r7 = r13;
                                                    } else {
                                                        r7 = r13;
                                                    }
                                                    if (r7 != 0) {
                                                        zzaH();
                                                    }
                                                    zzssVarZzaO = zzaO(e, this.zzC);
                                                    if (zzssVarZzaO.zza == 1101) {
                                                        i7 = 4006;
                                                    } else {
                                                        i7 = 4003;
                                                    }
                                                    throw zzN(zzssVarZzaO, this.zzm, r7, i7);
                                                }
                                            }
                                            break;
                                        } while (zzax(j9));
                                        Trace.endSection();
                                    } else {
                                        this.zza.zzd += zzP(j7);
                                        zzaw(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e14) {
                                e = e14;
                                z9 = false;
                            }
                        } catch (IllegalStateException e15) {
                            e = e15;
                        }
                    } catch (MediaCodec.CryptoException e16) {
                        e = e16;
                    }
                } catch (MediaCodec.CryptoException e17) {
                    e = e17;
                    throw zzN(e, this.zzm, r12, zzeo.zzF(e.getErrorCode()));
                } catch (IllegalStateException e18) {
                    e = e18;
                }
            } catch (MediaCodec.CryptoException e19) {
                e = e19;
                r12 = 0;
            }
        } catch (IllegalStateException e20) {
            e = e20;
            z7 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzX() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzY() {
        return this.zzae;
    }

    protected final boolean zzaA(zzu zzuVar) {
        return this.zzp == null && zzad(zzuVar);
    }

    protected boolean zzaB(zzst zzstVar) {
        return true;
    }

    protected final boolean zzaC() {
        return this.zzR;
    }

    protected final zzsq zzaD() {
        return this.zzv;
    }

    protected final zzu zzaE() {
        return this.zzw;
    }

    protected final MediaFormat zzaF() {
        return this.zzx;
    }

    protected final zzst zzaG() {
        return this.zzC;
    }

    protected final void zzaH() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar != null) {
                zzsqVar.zzk();
                this.zza.zzb++;
                zzst zzstVar = this.zzC;
                if (zzstVar == null) {
                    throw null;
                }
                zzaj(zzstVar.zza);
            }
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaN();
        } catch (Throwable th) {
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaN();
            throw th;
        }
    }

    protected final boolean zzaI() throws zzhz {
        boolean zZzat = zzat();
        if (zZzat) {
            zzaz();
        }
        return zZzat;
    }

    protected boolean zzaJ() {
        int i7 = this.zzX;
        if (i7 == 3 || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        try {
            zzbl();
            return false;
        } catch (zzhz e7) {
            zzds.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
            return true;
        }
    }

    protected boolean zzaK() {
        return true;
    }

    protected final long zzaL() {
        return this.zzal;
    }

    protected void zzaM() {
        zzbe();
        zzbf();
        zzav();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzJ = -9223372036854775807L;
        this.zzY = false;
        this.zzG = false;
        this.zzH = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    protected final void zzaN() {
        zzaM();
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzaa = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzI = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
    }

    protected zzss zzaO(Throwable th, zzst zzstVar) {
        return new zzss(th, zzstVar);
    }

    protected boolean zzaP(zzu zzuVar) {
        return true;
    }

    protected void zzaQ(zzhg zzhgVar) {
    }

    protected int zzaR(zzhg zzhgVar) {
        return 0;
    }

    protected boolean zzaS(zzhg zzhgVar) {
        return false;
    }

    protected final long zzaT() {
        return this.zzac;
    }

    protected void zzaU(long j7) {
        this.zzah = j7;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j7 < ((zzsy) arrayDeque.peek()).zzb) {
                return;
            }
            zzsy zzsyVar = (zzsy) arrayDeque.poll();
            zzsyVar.getClass();
            zzbk(zzsyVar);
            zzao();
        }
    }

    protected final boolean zzaV() {
        if (this.zzm == null) {
            return false;
        }
        if (zzQ() || zzbd()) {
            return true;
        }
        return this.zzL != -9223372036854775807L && zzL().zzb() < this.zzL;
    }

    protected final float zzaW() {
        return this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlk zzaX() {
        return this.zzq;
    }

    protected final boolean zzaY() {
        return zzbg(this.zzw);
    }

    protected final long zzaZ() {
        return this.zzag.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzaa(zzu zzuVar) throws zzhz {
        try {
            return zzab(this.zzd, zzuVar);
        } catch (zztd e7) {
            throw zzN(e7, zzuVar, false, 4002);
        }
    }

    protected abstract int zzab(zztb zztbVar, zzu zzuVar);

    protected abstract List zzac(zztb zztbVar, zzu zzuVar, boolean z7);

    protected boolean zzad(zzu zzuVar) {
        return false;
    }

    protected abstract zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f7);

    protected zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        throw null;
    }

    protected long zzag(long j7, long j8, boolean z7) {
        return super.zzT(j7, j8);
    }

    protected float zzah(float f7, zzu zzuVar, zzu[] zzuVarArr) {
        throw null;
    }

    protected void zzai(String str, zzsn zzsnVar, long j7, long j8) {
        throw null;
    }

    protected void zzaj(String str) {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    protected zzhs zzal(zzkh zzkhVar) {
        int i7;
        boolean z7 = true;
        this.zzaf = true;
        zzu zzuVarZzM = zzkhVar.zzb;
        zzuVarZzM.getClass();
        String str = zzuVarZzM.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzuVarZzM, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !zzuVarZzM.zzr.isEmpty()) {
            zzs zzsVarZza = zzuVarZzM.zza();
            zzsVarZza.zzp(null);
            zzuVarZzM = zzsVarZza.zzM();
        }
        zzu zzuVar = zzuVarZzM;
        this.zzp = zzkhVar.zza;
        this.zzm = zzuVar;
        if (this.zzR) {
            this.zzT = true;
            return null;
        }
        zzsq zzsqVar = this.zzv;
        if (zzsqVar == null) {
            this.zzA = null;
            zzaz();
            return null;
        }
        zzst zzstVar = this.zzC;
        zzstVar.getClass();
        zzu zzuVar2 = this.zzw;
        zzuVar2.getClass();
        zzrn zzrnVar = this.zzo;
        zzrn zzrnVar2 = this.zzp;
        if (zzrnVar != zzrnVar2) {
            zzbi();
            return new zzhs(zzstVar.zza, zzuVar2, zzuVar, 0, 128);
        }
        zzhs zzhsVarZzaf = zzaf(zzstVar, zzuVar2, zzuVar);
        int i8 = zzhsVarZzaf.zzd;
        if (i8 != 0) {
            i7 = 2;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (zzbg(zzuVar)) {
                        this.zzw = zzuVar;
                        if (zzrnVar2 == zzrnVar || zzbh()) {
                        }
                    } else {
                        i7 = 16;
                    }
                } else if (zzbg(zzuVar)) {
                    this.zzU = true;
                    this.zzV = 1;
                    int i9 = this.zzD;
                    if (i9 != 2 && (i9 != 1 || zzuVar.zzv != zzuVar2.zzv || zzuVar.zzw != zzuVar2.zzw)) {
                        z7 = false;
                    }
                    this.zzG = z7;
                    this.zzw = zzuVar;
                    if (zzrnVar2 == zzrnVar || zzbh()) {
                    }
                } else {
                    i7 = 16;
                }
            } else if (zzbg(zzuVar)) {
                this.zzw = zzuVar;
                if (zzrnVar2 != zzrnVar) {
                    if (zzbh()) {
                    }
                } else if (this.zzY) {
                    this.zzW = 1;
                    if (this.zzF) {
                        this.zzX = 3;
                    } else {
                        this.zzX = 1;
                    }
                }
            } else {
                i7 = 16;
            }
            return (i8 != 0 || (this.zzv == zzsqVar && this.zzX != 3)) ? zzhsVarZzaf : new zzhs(zzstVar.zza, zzuVar2, zzuVar, 0, i7);
        }
        zzbi();
        i7 = 0;
        if (i8 != 0) {
        }
    }

    protected void zzam(zzu zzuVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void zzao() {
    }

    protected abstract boolean zzap(long j7, long j8, zzsq zzsqVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, zzu zzuVar);

    protected void zzaq() {
        throw null;
    }

    protected void zzar(zzhg zzhgVar) {
        throw null;
    }

    public final void zzay() {
        this.zzaj = true;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0235 A[Catch: zzsw -> 0x0084, TryCatch #0 {zzsw -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:121:0x021c, B:123:0x0235, B:125:0x023e, B:128:0x0245, B:129:0x0247, B:124:0x0238, B:131:0x0249, B:132:0x024a, B:134:0x024f, B:135:0x0250, B:136:0x025a, B:38:0x008c, B:39:0x0094, B:138:0x025d), top: B:142:0x0057, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0238 A[Catch: zzsw -> 0x0084, TryCatch #0 {zzsw -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:121:0x021c, B:123:0x0235, B:125:0x023e, B:128:0x0245, B:129:0x0247, B:124:0x0238, B:131:0x0249, B:132:0x024a, B:134:0x024f, B:135:0x0250, B:136:0x025a, B:38:0x008c, B:39:0x0094, B:138:0x025d), top: B:142:0x0057, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0244  */
    /* JADX WARN: Code duplicated, block: B:157:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzso] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzst] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzsn] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final void zzaz() throws zzhz {
        zzu zzuVar;
        boolean z7;
        ?? r10;
        zzsw zzswVar;
        zzsw zzswVar2;
        long j7;
        boolean z8;
        if (this.zzv != null || this.zzR || (zzuVar = this.zzm) == null) {
            return;
        }
        boolean z9 = true;
        if (zzaA(zzuVar)) {
            zzan();
            String str = zzuVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzR = true;
            return;
        }
        zzrn zzrnVar = this.zzp;
        this.zzo = zzrnVar;
        if (zzrnVar != null) {
            zzghc.zzh(true);
            zzrn zzrnVar2 = this.zzo;
            boolean z10 = zzrw.zza;
            zzrnVar2.zza();
        }
        try {
            zzu zzuVar2 = this.zzm;
            MediaCrypto mediaCrypto = null;
            if (zzuVar2 == null) {
                throw null;
            }
            if (this.zzA == null) {
                try {
                    List listZzac = zzac(this.zzd, zzuVar2, false);
                    listZzac.isEmpty();
                    this.zzA = new ArrayDeque();
                    if (!listZzac.isEmpty()) {
                        this.zzA.add((zzst) listZzac.get(0));
                    }
                    this.zzB = null;
                } catch (zztd e7) {
                    throw new zzsw(zzuVar2, (Throwable) e7, false, -49998);
                }
            }
            if (this.zzA.isEmpty()) {
                throw new zzsw(zzuVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzA;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzv == null) {
                zzst zzstVar = (zzst) arrayDeque.peekFirst();
                if (zzstVar == null) {
                    throw mediaCrypto;
                }
                zzaP(zzuVar2);
                if (!zzaB(zzstVar)) {
                    return;
                }
                try {
                    this.zzC = zzstVar;
                    zzu zzuVar3 = this.zzm;
                    if (zzuVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str2 = zzstVar.zza;
                    float fZzah = zzah(this.zzu, zzuVar3, zzI());
                    if (fZzah <= this.zze) {
                        fZzah = -1.0f;
                    }
                    long jZzb = zzL().zzb();
                    z7 = z9;
                    try {
                        ?? Zzae = zzae(zzstVar, zzuVar3, mediaCrypto, fZzah);
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            LogSessionId logSessionIdZza = zzK().zza();
                            j7 = jZzb;
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                Zzae.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                            }
                        } else {
                            j7 = jZzb;
                        }
                        try {
                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str2);
                            Trace.beginSection(sb.toString());
                            zzsq zzsqVarZzb = this.zzc.zzb(Zzae);
                            this.zzv = zzsqVarZzb;
                            this.zzK = zzsqVarZzb.zzl(new zzsx(this, null));
                            Trace.endSection();
                            long jZzb2 = zzL().zzb();
                            if (!zzstVar.zzc(zzuVar3)) {
                                Object[] objArr = {zzu.zze(zzuVar3), str2};
                                String str3 = zzeo.zza;
                                zzds.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzz = fZzah;
                            this.zzw = zzuVar3;
                            this.zzD = 0;
                            this.zzE = (i7 == 29 && "c2.android.aac.decoder".equals(str2)) ? z7 : false;
                            this.zzF = false;
                            String str4 = zzstVar.zza;
                            if (i7 > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str4) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.avc.tunnel".equals(str4) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) {
                                z8 = ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzstVar.zzf) ? z7 : false;
                            }
                            this.zzI = z8;
                            if (this.zzv == null) {
                                throw null;
                            }
                            if (zze() == 2) {
                                this.zzL = zzL().zzb() + 1000;
                            }
                            this.zza.zza++;
                            Zzae = zzstVar;
                            try {
                                zzai(str2, Zzae, jZzb2, jZzb2 - j7);
                            } catch (Exception e8) {
                                e = e8;
                                r10 = Zzae;
                                zzds.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                arrayDeque.removeFirst();
                                zzswVar = new zzsw(zzuVar2, (Throwable) e, false, (zzst) r10);
                                zzak(zzswVar);
                                zzswVar2 = this.zzB;
                                if (zzswVar2 == null) {
                                    this.zzB = zzswVar;
                                } else {
                                    this.zzB = zzswVar2.zza(zzswVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzB;
                                }
                            }
                            z9 = z7;
                            mediaCrypto = null;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        r10 = zzstVar;
                    }
                } catch (Exception e10) {
                    e = e10;
                    z7 = z9;
                }
                r10 = zzstVar;
                zzds.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                arrayDeque.removeFirst();
                zzswVar = new zzsw(zzuVar2, (Throwable) e, false, (zzst) r10);
                zzak(zzswVar);
                zzswVar2 = this.zzB;
                if (zzswVar2 == null) {
                    this.zzB = zzswVar;
                } else {
                    this.zzB = zzswVar2.zza(zzswVar);
                }
                if (!arrayDeque.isEmpty()) {
                    throw this.zzB;
                }
                z9 = z7;
                mediaCrypto = null;
            }
            this.zzA = mediaCrypto;
        } catch (zzsw e11) {
            throw zzN(e11, zzuVar, false, 4001);
        }
    }

    protected final long zzba() {
        return this.zzag.zzc;
    }

    final /* synthetic */ zzlk zzbc() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzln
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public void zzx(int i7, Object obj) {
        if (i7 == 11) {
            zzlk zzlkVar = (zzlk) obj;
            zzlkVar.getClass();
            this.zzq = zzlkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected void zzy(boolean z7, boolean z8) {
        this.zza = new zzhr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzhq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzu[] zzuVarArr, long j7, long j8, zzup zzupVar) {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzbk(new zzsy(-9223372036854775807L, j7, j8));
            if (this.zzaj) {
                zzao();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j9 = this.zzab;
            if (j9 != -9223372036854775807L) {
                long j10 = this.zzah;
                if (j10 != -9223372036854775807L) {
                }
            }
            zzbk(new zzsy(-9223372036854775807L, j7, j8));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzao();
                return;
            }
            return;
        }
        arrayDeque.add(new zzsy(this.zzab, j7, j8));
    }
}
