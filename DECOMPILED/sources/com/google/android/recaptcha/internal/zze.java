package com.google.android.recaptcha.internal;

import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6644X0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zze {
    private boolean zza;

    protected zzen zza(String str) {
        throw null;
    }

    protected zzen zzb() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (r0 == r5) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j7, InterfaceC1875e interfaceC1875e) {
        zza zzaVar;
        zzen zzenVarZza;
        Exception exc;
        long j8;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        zzbd zzbdVarZza;
        String str2;
        zze zzeVar3;
        String str3;
        long j9;
        Exception e7;
        String str4 = str;
        long j10 = j7;
        if (interfaceC1875e instanceof zza) {
            zzaVar = (zza) interfaceC1875e;
            int i7 = zzaVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, interfaceC1875e);
            }
        } else {
            zzaVar = new zza(this, interfaceC1875e);
        }
        zza zzaVar2 = zzaVar;
        Object objM28136c = zzaVar2.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzaVar2.zze;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM28136c);
            zzenVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzenVarZza;
                zzaVar2.zzb = j10;
                zzaVar2.zze = 1;
                objM28136c = AbstractC6644X0.m28136c(j10, zzbVar, zzaVar2);
                if (objM28136c != objE) {
                    zzeVar2 = this;
                }
            } catch (Exception e8) {
                exc = e8;
                j8 = j10;
                zzenVar = zzenVarZza;
                zzeVar = this;
                zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVarZza);
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j8, exc, zzaVar2) != objE) {
                    zzeVar3 = zzeVar;
                    str3 = str2;
                    C1436n.a aVar = C1436n.f4958b;
                    zzaVar2.zza = null;
                    zzaVar2.zzf = null;
                    zzaVar2.zze = 3;
                    objM28136c = zzeVar3.zzd(str3, zzaVar2);
                }
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                str3 = zzaVar2.zzf;
                zzeVar3 = (zze) zzaVar2.zza;
                AbstractC1437o.m6082b(objM28136c);
                C1436n.a aVar2 = C1436n.f4958b;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objM28136c = zzeVar3.zzd(str3, zzaVar2);
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objM28136c);
            }
            return C1436n.m6073b(objM28136c);
        }
        long j11 = zzaVar2.zzb;
        zzenVar = zzaVar2.zzg;
        String str5 = zzaVar2.zzf;
        zzeVar2 = (zze) zzaVar2.zza;
        try {
            AbstractC1437o.m6082b(objM28136c);
            zzenVarZza = zzenVar;
            j10 = j11;
            str4 = str5;
        } catch (Exception e9) {
            e7 = e9;
            j9 = j11;
            str4 = str5;
            zzeVar = zzeVar2;
            j8 = j9;
            exc = e7;
            zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j8, exc, zzaVar2) != objE) {
                zzeVar3 = zzeVar;
                str3 = str2;
                C1436n.a aVar3 = C1436n.f4958b;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objM28136c = zzeVar3.zzd(str3, zzaVar2);
            }
            return objE;
        }
        try {
            Object objM6080i = ((C1436n) objM28136c).m6080i();
            AbstractC1437o.m6082b(objM6080i);
            zzsi zzsiVar = (zzsi) objM6080i;
            if (zzenVarZza != null) {
                zzenVarZza.zza();
            }
            return C1436n.m6073b(zzsiVar);
        } catch (Exception e10) {
            e7 = e10;
            j9 = j10;
            zzenVar = zzenVarZza;
            zzeVar = zzeVar2;
            j8 = j9;
            exc = e7;
            zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j8, exc, zzaVar2) != objE) {
                zzeVar3 = zzeVar;
                str3 = str2;
                C1436n.a aVar4 = C1436n.f4958b;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objM28136c = zzeVar3.zzd(str3, zzaVar2);
            }
            return objE;
        }
    }

    protected abstract Object zzd(String str, InterfaceC1875e interfaceC1875e);

    /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[PHI: r8 r9 r11
      0x00a9: PHI (r8v12 com.google.android.recaptcha.internal.zzen) = (r8v8 com.google.android.recaptcha.internal.zzen), (r8v19 com.google.android.recaptcha.internal.zzen) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v6 com.google.android.recaptcha.internal.zze) = (r9v3 com.google.android.recaptcha.internal.zze), (r9v11 com.google.android.recaptcha.internal.zze) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v8 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(long j7, zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        zzc zzcVar;
        Exception e7;
        zze zzeVar;
        zzen zzenVar;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        if (interfaceC1875e instanceof zzc) {
            zzcVar = (zzc) interfaceC1875e;
            int i7 = zzcVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, interfaceC1875e);
            }
        } else {
            zzcVar = new zzc(this, interfaceC1875e);
        }
        Object objZzj = zzcVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzcVar.zzd;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZzj);
            zzen zzenVarZzb = zzb();
            if (this.zza) {
                zzenVarZzb.zza();
                C1436n.a aVar = C1436n.f4958b;
                return C1436n.m6073b(C1444v.f4971a);
            }
            try {
                zzd zzdVar = new zzd(this, zzscVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzenVarZzb;
                zzcVar.zzd = 1;
                Object objM28136c = AbstractC6644X0.m28136c(j7, zzdVar, zzcVar);
                if (objM28136c != objE) {
                    objZzj = objM28136c;
                    zzenVar = zzenVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e8) {
                e7 = e8;
                zzeVar = this;
                zzenVar = zzenVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzenVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e7, zzcVar);
                if (objZzj != objE) {
                    zzbdVar = (zzbd) objZzj;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar);
                    }
                    zzcVar.zza = zzbdVar;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar, zzcVar) != objE) {
                        zzbdVar2 = zzbdVar;
                        C1436n.a aVar2 = C1436n.f4958b;
                        return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar2));
                    }
                }
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                AbstractC1437o.m6082b(objZzj);
                zzbdVar = (zzbd) objZzj;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != objE) {
                    zzbdVar2 = zzbdVar;
                }
                return objE;
            }
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbdVar2 = (zzbd) zzcVar.zza;
            AbstractC1437o.m6082b(objZzj);
            C1436n.a aVar3 = C1436n.f4958b;
            return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar2));
        }
        zzenVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            AbstractC1437o.m6082b(objZzj);
        } catch (Exception e9) {
            e7 = e9;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzenVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e7, zzcVar);
            if (objZzj != objE) {
                zzbdVar = (zzbd) objZzj;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != objE) {
                    zzbdVar2 = zzbdVar;
                    C1436n.a aVar4 = C1436n.f4958b;
                    return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar2));
                }
            }
            return objE;
        }
        AbstractC1437o.m6082b(((C1436n) objZzj).m6080i());
        C1444v c1444v = C1444v.f4971a;
        zzeVar.zza = true;
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return C1436n.m6073b(c1444v);
    }

    protected abstract Object zzf(String str, InterfaceC1875e interfaceC1875e);

    protected Object zzg(zzbd zzbdVar, InterfaceC1875e interfaceC1875e) {
        return C1444v.f4971a;
    }

    protected abstract Object zzh(zzsc zzscVar, InterfaceC1875e interfaceC1875e);

    protected Object zzi(String str, long j7, Exception exc, InterfaceC1875e interfaceC1875e) {
        return C1444v.f4971a;
    }

    protected Object zzj(Exception exc, InterfaceC1875e interfaceC1875e) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    protected void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
