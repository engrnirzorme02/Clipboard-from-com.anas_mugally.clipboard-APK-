package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p302m6.C6405g;
import p318o6.AbstractC6672k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final C6405g zza = new C6405g("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j7, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.m27529a(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j7 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, long j7, InterfaceC1875e interfaceC1875e) {
        zzcy zzcyVar;
        zzbd zzbdVar;
        if (interfaceC1875e instanceof zzcy) {
            zzcyVar = (zzcy) interfaceC1875e;
            int i7 = zzcyVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, interfaceC1875e);
            }
        } else {
            zzcyVar = new zzcy(this, interfaceC1875e);
        }
        Object objZzg = zzcyVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzcyVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZzg);
            try {
                String string = UUID.randomUUID().toString();
                try {
                    InterfaceC5371p zzczVar = new zzcz(this, j7, recaptchaAction, string, null);
                    zzcyVar.zzc = 1;
                    objZzg = zzg(string, zzczVar, zzcyVar);
                    if (objZzg == objE) {
                        return objE;
                    }
                } catch (zzbd e7) {
                    e = e7;
                    zzbdVar = e;
                    C1436n.a aVar = C1436n.f4958b;
                    return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar.zzc()));
                }
            } catch (zzbd e8) {
                e = e8;
                zzbdVar = e;
                C1436n.a aVar2 = C1436n.f4958b;
                return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar.zzc()));
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                AbstractC1437o.m6082b(objZzg);
            } catch (zzbd e9) {
                zzbdVar = e9;
                C1436n.a aVar3 = C1436n.f4958b;
                return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar.zzc()));
            }
        }
        return ((C1436n) objZzg).m6080i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object zzg(String str, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdb zzdbVar;
        if (interfaceC1875e instanceof zzdb) {
            zzdbVar = (zzdb) interfaceC1875e;
            int i7 = zzdbVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, interfaceC1875e);
            }
        } else {
            zzdbVar = new zzdb(this, interfaceC1875e);
        }
        Object objInvoke = zzdbVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdbVar.zzc;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objInvoke);
                zzek zzekVarZza = this.zzd.zza();
                zzekVarZza.zzc(str);
                zzen zzenVarZzf = zzekVarZza.zzf(9);
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = interfaceC5371p.invoke(zzekVarZza, zzdbVar);
                str = zzenVarZzf;
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzen zzenVar = zzdbVar.zzd;
                AbstractC1437o.m6082b(objInvoke);
                str = zzenVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbd e7) {
            str.zzb(e7);
            throw e7;
        } catch (Exception e8) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e8.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo33399execute0E7RQCE(RecaptchaAction recaptchaAction, long j7, InterfaceC1875e<? super C1436n> interfaceC1875e) {
        zzcw zzcwVar;
        if (interfaceC1875e instanceof zzcw) {
            zzcwVar = (zzcw) interfaceC1875e;
            int i7 = zzcwVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, interfaceC1875e);
            }
        } else {
            zzcwVar = new zzcw(this, interfaceC1875e);
        }
        Object obj = zzcwVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzcwVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return ((C1436n) obj).m6080i();
        }
        AbstractC1437o.m6082b(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j7, zzcwVar);
        return objZzf == objE ? objE : objZzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo33400executegIAlus(RecaptchaAction recaptchaAction, InterfaceC1875e<? super C1436n> interfaceC1875e) {
        zzcx zzcxVar;
        if (interfaceC1875e instanceof zzcx) {
            zzcxVar = (zzcx) interfaceC1875e;
            int i7 = zzcxVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, interfaceC1875e);
            }
        } else {
            zzcxVar = new zzcx(this, interfaceC1875e);
        }
        Object obj = zzcxVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzcxVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return ((C1436n) obj).m6080i();
        }
        AbstractC1437o.m6082b(obj);
        zzcxVar.zzc = 1;
        Object objMo33399execute0E7RQCE = mo33399execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        return objMo33399execute0E7RQCE == objE ? objE : objMo33399execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(AbstractC6672k.m28225b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j7) {
        return zzas.zza(AbstractC6672k.m28225b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j7, null), 3, null));
    }
}
