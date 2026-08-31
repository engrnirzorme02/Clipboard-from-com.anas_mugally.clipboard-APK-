package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcds extends zzcau implements zzgy, zzmg {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdc zzc;
    private final zzyd zzd;
    private final zzcbc zze;
    private final WeakReference zzf;
    private final zzvw zzg;
    private zzik zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcat zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdf zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
    public zzcds(Context context, zzcbc zzcbcVar, zzcbd zzcbdVar, Integer num) {
        final boolean z7;
        final zzfz zzfzVar;
        this.zzb = context;
        this.zze = zzcbcVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcbdVar);
        zzcdc zzcdcVar = new zzcdc();
        this.zzc = zzcdcVar;
        zzyd zzydVar = new zzyd(context);
        this.zzd = zzydVar;
        if (AbstractC3490o0.m17547m()) {
            AbstractC3490o0.m17545k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcau.zzf().incrementAndGet();
        zzlu zzluVar = new zzlu(context, new zzlq() { // from class: com.google.android.gms.internal.ads.zzcdn
            @Override // com.google.android.gms.internal.ads.zzlq
            public final /* synthetic */ zzll[] zza(Handler handler, zzabm zzabmVar, zzpv zzpvVar, zzwt zzwtVar, zztn zztnVar) {
                return this.zza.zzW(handler, zzabmVar, zzpvVar, zzwtVar, zztnVar);
            }
        });
        zzluVar.zza(zzydVar);
        zzluVar.zzb(zzcdcVar);
        zzlv zzlvVarZzc = zzluVar.zzc();
        this.zzh = zzlvVarZzc;
        zzlvVarZzc.zzB(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgha.zzd(zzcbdVar != null ? zzcbdVar.zzn() : null).zza("");
        this.zzp = zzcbdVar != null ? zzcbdVar.zzp() : 0;
        final String strM17439O = C7351t.m32349g().m17439O(context, zzcbdVar.zzs().f30226a);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcl)).booleanValue()) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue()) {
                    z7 = zzcbcVar.zzi ? false : true;
                }
            } else if (zzcbcVar.zzi) {
            }
            final zzfz zzfzVar2 = zzcbcVar.zzl ? new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdi
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    return this.zza.zzS(strM17439O, z7);
                }
            } : zzcbcVar.zzh > 0 ? new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdk
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    return this.zza.zzU(strM17439O, z7);
                }
            } : new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdj
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    return this.zza.zzT(strM17439O, z7);
                }
            };
            zzfzVar = zzcbcVar.zzi ? new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    return this.zza.zzV(zzfzVar2);
                }
            } : zzfzVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzfzVar = new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdm
                    @Override // com.google.android.gms.internal.ads.zzfz
                    public final /* synthetic */ zzga zza() {
                        int i7 = zzcds.zza;
                        zzga zzgaVarZza = zzfzVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzcdg(new zzfv(bArr2), bArr2.length, zzgaVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzfzVar = new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdh
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    int i7 = zzcds.zza;
                    return new zzfv(bArr2);
                }
            };
        }
        this.zzg = new zzvw(zzfzVar, ((Boolean) C3250D.m17200c().zzd(zzbci.zzn)).booleanValue() ? zzcdp.zza : zzcdo.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcau.zzf().decrementAndGet();
        if (AbstractC3490o0.m17547m()) {
            AbstractC3490o0.m17545k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzA(int i7) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdb zzcdbVar = (zzcdb) ((WeakReference) it.next()).get();
            if (zzcdbVar != null) {
                zzcdbVar.zzk(i7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzC() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzD() {
        return this.zzh.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzE(boolean z7) {
        this.zzh.zzi(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzF(int i7) {
        this.zzc.zzj(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzG(int i7) {
        this.zzc.zzl(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzH() {
        return this.zzh.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j7 = this.zzn;
                    Map mapZzj = ((zzgt) arrayList.remove(0)).zzj();
                    long j8 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzggj.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j8 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j7 + j8;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzM(boolean z7) {
        if (this.zzh == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            this.zzh.zzD();
            if (i7 >= 2) {
                return;
            }
            zzyd zzydVar = this.zzd;
            zzxn zzxnVarZzd = zzydVar.zzc().zzd();
            zzxnVarZzd.zzy(i7, !z7);
            zzydVar.zzf(zzxnVarZzd);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzN() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzO() {
        return this.zzl;
    }

    final zzur zzR(Uri uri) {
        zzy zzyVar = new zzy();
        zzyVar.zzb(uri);
        zzaj zzajVarZzc = zzyVar.zzc();
        zzvw zzvwVar = this.zzg;
        zzvwVar.zza(this.zze.zzf);
        return zzvwVar.zzb(zzajVarZzc);
    }

    final /* synthetic */ zzga zzS(String str, boolean z7) {
        zzcds zzcdsVar = true != z7 ? null : this;
        zzcbc zzcbcVar = this.zze;
        return new zzcdv(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzm, zzcbcVar.zzn);
    }

    final /* synthetic */ zzga zzT(String str, boolean z7) {
        zzgh zzghVar = new zzgh();
        zzghVar.zzb(str);
        zzghVar.zzf(true != z7 ? null : this);
        zzcbc zzcbcVar = this.zze;
        zzghVar.zzc(zzcbcVar.zzd);
        zzghVar.zzd(zzcbcVar.zze);
        zzghVar.zze(true);
        return zzghVar.zza();
    }

    final /* synthetic */ zzga zzU(String str, boolean z7) {
        zzcds zzcdsVar = true != z7 ? null : this;
        zzcbc zzcbcVar = this.zze;
        zzcdb zzcdbVar = new zzcdb(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzh);
        this.zzu.add(new WeakReference(zzcdbVar));
        return zzcdbVar;
    }

    final /* synthetic */ zzga zzV(zzfz zzfzVar) {
        zzga zzgaVarZza = zzfzVar.zza();
        zzcdd zzcddVar = new zzcdd() { // from class: com.google.android.gms.internal.ads.zzcdq
            @Override // com.google.android.gms.internal.ads.zzcdd
            public final /* synthetic */ void zza(boolean z7, long j7) {
                this.zza.zzX(z7, j7);
            }
        };
        return new zzcdf(this.zzb, zzgaVarZza, this.zzo, this.zzp, this, zzcddVar);
    }

    final /* synthetic */ zzll[] zzW(Handler handler, zzabm zzabmVar, zzpv zzpvVar, zzwt zzwtVar, zztn zztnVar) {
        zztb zztbVar = zztb.zzb;
        Context context = this.zzb;
        zzrg zzrgVar = new zzrg(context, new zzsi(context, null, null), zztbVar, false, handler, zzpvVar, new zzqk(context).zza());
        zzaac zzaacVar = new zzaac(context);
        zzaacVar.zza(zztbVar);
        zzaacVar.zzb(handler);
        zzaacVar.zzc(zzabmVar);
        return new zzll[]{zzrgVar, zzaacVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z7, long j7) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzr(z7, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z7) {
        if (zzgaVar instanceof zzgt) {
            synchronized (this.zzq) {
                this.zzs.add((zzgt) zzgaVar);
            }
        } else if (zzgaVar instanceof zzcdf) {
            this.zzt = (zzcdf) zzgaVar;
            final zzcbd zzcbdVar = (zzcbd) this.zzf.get();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() && zzcbdVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i7 = zzcds.zza;
                        zzcbdVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z7, int i7) {
        this.zzl += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zze(zzme zzmeVar, int i7) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzs(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzu("onPlayerError", zzatVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z7) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            if (this.zze.zzj) {
                zzcatVar.zzv("onLoadException", iOException);
            } else {
                zzcatVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzk(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzuVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzl(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzuVar.zzz));
        map.put("bitRate", String.valueOf(zzuVar.zzj));
        int i7 = zzuVar.zzv;
        int i8 = zzuVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        map.put("resolution", sb.toString());
        String str = zzuVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzm(zzme zzmeVar, int i7, long j7) {
        this.zzm += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzo(zzme zzmeVar, Object obj, long j7) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzt(zzbuVar.zzb, zzbuVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7) {
        zzur zzvgVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z7;
            int length = uriArr.length;
            if (length == 1) {
                zzvgVar = zzR(uriArr[0]);
            } else {
                zzur[] zzurVarArr = new zzur[length];
                for (int i7 = 0; i7 < uriArr.length; i7++) {
                    zzurVarArr[i7] = zzR(uriArr[i7]);
                }
                zzvgVar = new zzvg(false, false, new zzua(), zzurVarArr);
            }
            this.zzh.zzE(zzvgVar);
            this.zzh.zzf();
            zzcau.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzs(zzcat zzcatVar) {
        this.zzk = zzcatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzt() {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzC(this);
            this.zzh.zzF();
            this.zzh = null;
            zzcau.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzu(Surface surface, boolean z7) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzA(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzv(float f7, boolean z7) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzz(f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzw() {
        this.zzh.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzx(long j7) {
        this.zzh.zza(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzy(int i7) {
        this.zzc.zzm(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzz(int i7) {
        this.zzc.zzn(i7);
    }
}
