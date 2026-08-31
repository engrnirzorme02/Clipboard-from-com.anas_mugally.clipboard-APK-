package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p135R2.C1328b;
import p142S2.AbstractC1404o;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3545a {
    /* JADX INFO: renamed from: a */
    public static C3546b m17727a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new C3546b(activity, (GoogleSignInOptions) AbstractC3718s.m18083l(googleSignInOptions));
    }

    /* JADX INFO: renamed from: b */
    public static C3546b m17728b(Context context, GoogleSignInOptions googleSignInOptions) {
        return new C3546b(context, (GoogleSignInOptions) AbstractC3718s.m18083l(googleSignInOptions));
    }

    /* JADX INFO: renamed from: c */
    public static Task m17729c(Intent intent) {
        C1328b c1328bM5991f = AbstractC1404o.m5991f(intent);
        GoogleSignInAccount googleSignInAccountM5691a = c1328bM5991f.m5691a();
        return (!c1328bM5991f.getStatus().m17747X() || googleSignInAccountM5691a == null) ? Tasks.forException(AbstractC3684b.m18000a(c1328bM5991f.getStatus())) : Tasks.forResult(googleSignInAccountM5691a);
    }
}
