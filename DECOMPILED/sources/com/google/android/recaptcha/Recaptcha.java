package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: loaded from: classes2.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m33397getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j7, InterfaceC1875e interfaceC1875e, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j7 = 10000;
        }
        return recaptcha.m33398getClientBWLJW6A(application, str, j7, interfaceC1875e);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, InterfaceC1875e<? super RecaptchaClient> interfaceC1875e) {
        return zzcq.zzd(application, str, interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m33398getClientBWLJW6A(Application application, String str, long j7, InterfaceC1875e<? super C1436n> interfaceC1875e) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (interfaceC1875e instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) interfaceC1875e;
            int i7 = recaptcha$getClient$1.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i7 - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, interfaceC1875e);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, interfaceC1875e);
        }
        Object objZzb = recaptcha$getClient$1.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = recaptcha$getClient$1.zzc;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objZzb);
                C1436n.a aVar = C1436n.f4958b;
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j7, recaptcha$getClient$1);
                if (objZzb == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objZzb);
            }
            return C1436n.m6073b((zzdc) objZzb);
        } catch (Throwable th) {
            C1436n.a aVar2 = C1436n.f4958b;
            return C1436n.m6073b(AbstractC1437o.m6081a(th));
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j7) {
        return zzcq.zzc(application, str, j7);
    }
}
