package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3756k;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdf extends zzfs {
    private final Context zza;
    private final zzga zzb;
    private final zzcdd zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbat zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private InterfaceFutureC1673e zzp;
    private final AtomicLong zzq;

    public zzcdf(Context context, zzga zzgaVar, String str, int i7, zzgy zzgyVar, zzcdd zzcddVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = zzcddVar;
        this.zzd = str;
        this.zze = i7;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue();
        zze(zzgyVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzeQ)).booleanValue() || this.zzm) {
            return ((Boolean) C3250D.m17200c().zzd(zzbci.zzeR)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int iZza = inputStream != null ? inputStream.read(bArr, i7, i8) : this.zzb.zza(bArr, i7, i8);
        if (this.zzf && this.zzg == null) {
            return iZza;
        }
        zzh(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws Throwable {
        zzbaq zzbaqVarZzc;
        Long l7;
        boolean z7;
        boolean z8;
        long jMo18161c;
        StringBuilder sb;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z9 = true;
        this.zzh = true;
        Uri uri = zzgeVar.zza;
        this.zzi = uri;
        boolean z10 = this.zzf;
        if (z10 == 0) {
            zzg(zzgeVar);
        }
        this.zzj = zzbat.zza(uri);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzgeVar.zze;
                this.zzj.zzi = zzghs.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbaqVarZzc = C7351t.m32356n().zzc(this.zzj);
            } else {
                zzbaqVarZzc = null;
            }
            if (zzbaqVarZzc != null && zzbaqVarZzc.zza()) {
                this.zzk = zzbaqVarZzc.zzd();
                this.zzm = zzbaqVarZzc.zzg();
                this.zzn = zzbaqVarZzc.zze();
                this.zzo = zzbaqVarZzc.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbaqVarZzc.zzb();
                    if (this.zzf) {
                        zzg(zzgeVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzgeVar.zze;
            this.zzj.zzi = zzghs.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeP);
            } else {
                l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeO);
            }
            long jLongValue = l7.longValue();
            long jMo18161c2 = C7351t.m32357o().mo18161c();
            C7351t.m32342D();
            Future futureZza = zzbbe.zza(this.zza, this.zzj);
            try {
                try {
                    zzbbf zzbbfVar = (zzbbf) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzk = zzbbfVar.zzc();
                        this.zzm = zzbbfVar.zzd();
                        this.zzn = zzbbfVar.zzf();
                        this.zzo = zzbbfVar.zze();
                        if (!zzr()) {
                            this.zzg = zzbbfVar.zzb();
                            if (z10 != 0) {
                                zzg(zzgeVar);
                            }
                            long jMo18161c3 = C7351t.m32357o().mo18161c() - jMo18161c2;
                            this.zzc.zza(true, jMo18161c3);
                            this.zzl = true;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jMo18161c3).length() + 24);
                            sb2.append("Cache connection took ");
                            sb2.append(jMo18161c3);
                            sb2.append("ms");
                            AbstractC3490o0.m17545k(sb2.toString());
                            return -1L;
                        }
                        long jMo18161c4 = C7351t.m32357o().mo18161c() - jMo18161c2;
                        this.zzc.zza(true, jMo18161c4);
                        this.zzl = true;
                        sb = new StringBuilder(String.valueOf(jMo18161c4).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jMo18161c4);
                    } catch (InterruptedException unused) {
                        z8 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jMo18161c = C7351t.m32357o().mo18161c() - jMo18161c2;
                        this.zzc.zza(z8, jMo18161c);
                        this.zzl = z8;
                        int length = String.valueOf(jMo18161c).length() + 24;
                        sb = new StringBuilder(length);
                        z10 = length;
                        sb.append("Cache connection took ");
                        sb.append(jMo18161c);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z7 = true;
                        futureZza.cancel(true);
                        jMo18161c = C7351t.m32357o().mo18161c() - jMo18161c2;
                        this.zzc.zza(z7, jMo18161c);
                        this.zzl = z7;
                        int length2 = String.valueOf(jMo18161c).length() + 24;
                        sb = new StringBuilder(length2);
                        z10 = length2;
                        sb.append("Cache connection took ");
                        sb.append(jMo18161c);
                    } catch (Throwable th) {
                        th = th;
                        long jMo18161c5 = C7351t.m32357o().mo18161c() - jMo18161c2;
                        this.zzc.zza(z9, jMo18161c5);
                        this.zzl = z9;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jMo18161c5).length() + 24);
                        sb3.append("Cache connection took ");
                        sb3.append(jMo18161c5);
                        sb3.append("ms");
                        AbstractC3490o0.m17545k(sb3.toString());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z9 = z10;
                }
            } catch (InterruptedException unused3) {
                z8 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z7 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = false;
            }
            sb.append("ms");
            AbstractC3490o0.m17545k(sb.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzgd zzgdVarZzb = zzgeVar.zzb();
            zzgdVarZzb.zza(Uri.parse(this.zzj.zza));
            zzgeVar = zzgdVarZzb.zze();
        }
        return this.zzb.zzb(zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z7 = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            AbstractC3756k.m18186a(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z7) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcde
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzq();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long zzq() {
        return Long.valueOf(C7351t.m32356n().zzd(this.zzj));
    }
}
