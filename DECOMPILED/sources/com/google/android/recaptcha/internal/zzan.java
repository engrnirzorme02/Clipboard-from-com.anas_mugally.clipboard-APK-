package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6672k;
import p318o6.AbstractC6702z;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6639V;
import p318o6.InterfaceC6698x;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan {
    public InterfaceC6698x zza;
    private final InterfaceC6624N zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final InterfaceC7419a zzg = AbstractC7425g.m32877b(false, 1, null);

    public zzan(Context context, InterfaceC6624N interfaceC6624N, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j7) {
        this.zzb = interfaceC6624N;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(InterfaceC1875e interfaceC1875e) {
        zzag zzagVar;
        if (interfaceC1875e instanceof zzag) {
            zzagVar = (zzag) interfaceC1875e;
            int i7 = zzagVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, interfaceC1875e);
            }
        } else {
            zzagVar = new zzag(this, interfaceC1875e);
        }
        Object obj = zzagVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzagVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return obj;
        }
        AbstractC1437o.m6082b(obj);
        InterfaceC6639V interfaceC6639VZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = interfaceC6639VZza.await(zzagVar);
        return objAwait == objE ? objE : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, InterfaceC1875e interfaceC1875e) {
        zzah zzahVar;
        if (interfaceC1875e instanceof zzah) {
            zzahVar = (zzah) interfaceC1875e;
            int i7 = zzahVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzahVar = new zzah(this, interfaceC1875e);
            }
        } else {
            zzahVar = new zzah(this, interfaceC1875e);
        }
        Object objAwait = zzahVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzahVar.zzc;
        if (i8 != 0) {
            if (i8 == 1) {
                str = zzahVar.zzd;
                AbstractC1437o.m6082b(objAwait);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objAwait);
            }
            return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
        }
        AbstractC1437o.m6082b(objAwait);
        InterfaceC6698x interfaceC6698xZzf = zzf();
        zzahVar.zzd = str;
        zzahVar.zzc = 1;
        objAwait = interfaceC6698xZzf.await(zzahVar);
        if (objAwait != objE) {
        }
        return objE;
        InterfaceC6639V interfaceC6639VZza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        objAwait = interfaceC6639VZza.await(zzahVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[PHI: r2 r7
      0x0069: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r8 != r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, InterfaceC1875e interfaceC1875e) {
        zzaf zzafVar;
        zzan zzanVar;
        if (interfaceC1875e instanceof zzaf) {
            zzafVar = (zzaf) interfaceC1875e;
            int i7 = zzafVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzafVar = new zzaf(this, interfaceC1875e);
            }
        } else {
            zzafVar = new zzaf(this, interfaceC1875e);
        }
        Object objZzj = zzafVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzafVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZzj);
            try {
                zzafVar.zzd = this;
                zzafVar.zze = str;
                zzafVar.zzc = 1;
                objZzj = zzj(str, zzafVar);
                if (objZzj != objE) {
                    zzanVar = this;
                }
            } catch (Exception unused) {
                zzanVar = this;
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != objE) {
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    objZzj = zzanVar.zzj(str, zzafVar);
                }
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                str = zzafVar.zze;
                zzanVar = zzafVar.zzd;
                AbstractC1437o.m6082b(objZzj);
                zzafVar.zzd = null;
                zzafVar.zze = null;
                zzafVar.zzc = 3;
                objZzj = zzanVar.zzj(str, zzafVar);
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objZzj);
            }
            return (String) objZzj;
        }
        str = zzafVar.zze;
        zzanVar = zzafVar.zzd;
        try {
            AbstractC1437o.m6082b(objZzj);
        } catch (Exception unused2) {
            zzafVar.zzd = zzanVar;
            zzafVar.zze = str;
            zzafVar.zzc = 2;
            if (zzanVar.zze(zzafVar) != objE) {
                zzafVar.zzd = null;
                zzafVar.zze = null;
                zzafVar.zzc = 3;
                objZzj = zzanVar.zzj(str, zzafVar);
            }
            return objE;
        }
        return (String) objZzj;
    }

    public final Object zzd(long j7, InterfaceC1875e interfaceC1875e) {
        this.zzf = j7;
        return C1444v.f4971a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (p145S5.C1444v.f4971a == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(InterfaceC1875e interfaceC1875e) {
        zzak zzakVar;
        InterfaceC7419a interfaceC7419a;
        zzan zzanVar;
        if (interfaceC1875e instanceof zzak) {
            zzakVar = (zzak) interfaceC1875e;
            int i7 = zzakVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzakVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzakVar = new zzak(this, interfaceC1875e);
            }
        } else {
            zzakVar = new zzak(this, interfaceC1875e);
        }
        Object obj = zzakVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzakVar.zzd;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    interfaceC7419a = (InterfaceC7419a) zzakVar.zza;
                    zzanVar = zzakVar.zze;
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = this.zzg;
            zzakVar.zze = this;
            zzakVar.zza = interfaceC7419a;
            zzakVar.zzd = 1;
            if (interfaceC7419a.mo32856d(null, zzakVar) != objE) {
                zzanVar = this;
            }
            return objE;
            if (!AbstractC6118n.m27183a(zzanVar.zze, zzao.zza)) {
                C1444v c1444v = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v;
            }
            zzanVar.zze = zzao.zzb;
            C1444v c1444v2 = C1444v.f4971a;
            interfaceC7419a.mo32855c(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = AbstractC6702z.m28298b(null, 1, null);
            AbstractC6672k.m28227d(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3, null);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
        } catch (Throwable th) {
            interfaceC7419a.mo32855c(null);
            throw th;
        }
    }

    public final InterfaceC6698x zzf() {
        InterfaceC6698x interfaceC6698x = this.zza;
        if (interfaceC6698x != null) {
            return interfaceC6698x;
        }
        return null;
    }
}
