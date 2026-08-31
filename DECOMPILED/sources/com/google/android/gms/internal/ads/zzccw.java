package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccw extends zzccq implements zzgy {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcbc zze;
    private boolean zzf;
    private final zzccv zzg;
    private final zzcbz zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzccw(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        this.zze = zzcbcVar;
        this.zzg = new zzccv();
        this.zzh = new zzcbz();
        this.zzk = new Object();
        this.zzl = (String) zzgha.zzd(zzcbdVar != null ? zzcbdVar.zzn() : null).zza("");
        this.zzm = zzcbdVar != null ? zzcbdVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(C7590g.m33285o(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzP = zzcau.zzP();
        int iZzQ = zzcau.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.InterfaceC3641k
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z7) {
        if (zzgaVar instanceof zzgl) {
            this.zzg.zzb((zzgl) zzgaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z7, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z7) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        String str2;
        String str3;
        InterfaceC3750e interfaceC3750e;
        this.zzd = str;
        String str4 = "error";
        String strZzv = zzv(str);
        try {
            zzgh zzghVar = new zzgh();
            zzghVar.zzb(this.zzb);
            zzcbc zzcbcVar = this.zze;
            zzghVar.zzc(zzcbcVar.zzd);
            zzghVar.zzd(zzcbcVar.zze);
            zzghVar.zze(true);
            zzghVar.zzf(this);
            zzga zzgaVarZza = zzghVar.zza();
            if (zzcbcVar.zzi) {
                zzgaVarZza = new zzcbx(this.zza, zzgaVarZza, this.zzl, this.zzm, null, null);
            }
            zzgaVarZza.zzb(new zzge(Uri.parse(str), 0L, -1L, null));
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzv, this);
            }
            InterfaceC3750e interfaceC3750eM32357o = C7351t.m32357o();
            long jMo18159a = interfaceC3750eM32357o.mo18159a();
            long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzR)).longValue();
            long jLongValue2 = ((Long) C3250D.m17200c().zzd(zzbci.zzQ)).longValue();
            this.zzi = ByteBuffer.allocate(zzcbcVar.zzc);
            byte[] bArr = new byte[8192];
            long j7 = jMo18159a;
            while (true) {
                str2 = str4;
                try {
                    int iZza = zzgaVarZza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (iZza == -1) {
                        this.zzn = true;
                        zzp(str, strZzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        interfaceC3750e = interfaceC3750eM32357o;
                        try {
                            if (!this.zzf) {
                                this.zzi.put(bArr, 0, iZza);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.zzi.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(iLimit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long jMo18159a2 = interfaceC3750e.mo18159a();
                        if (jMo18159a2 - j7 >= jLongValue) {
                            zzx();
                            j7 = jMo18159a2;
                        }
                        if (jMo18159a2 - jMo18159a > 1000 * jLongValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(jLongValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        interfaceC3750eM32357o = interfaceC3750e;
                        jMo18159a = jMo18159a;
                    } catch (Exception e7) {
                        e = e7;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb3.append(canonicalName);
                        sb3.append(":");
                        sb3.append(message);
                        String string = sb3.toString();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 34 + string.length());
                        sb4.append("Failed to preload url ");
                        sb4.append(str);
                        sb4.append(" Exception: ");
                        sb4.append(string);
                        String string2 = sb4.toString();
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f(string2);
                        zzq(str, strZzv, str3, string);
                        return false;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb5.append(canonicalName2);
                    sb5.append(":");
                    sb5.append(message2);
                    String string3 = sb5.toString();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 34 + string3.length());
                    sb6.append("Failed to preload url ");
                    sb6.append(str);
                    sb6.append(" Exception: ");
                    sb6.append(string3);
                    String string4 = sb6.toString();
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f(string4);
                    zzq(str, strZzv, str3, string3);
                    return false;
                }
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }
}
