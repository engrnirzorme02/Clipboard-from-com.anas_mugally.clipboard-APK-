package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.internal.C3588a;
import com.google.android.gms.common.internal.AbstractC3716r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p100M2.AbstractC0886a;
import p142S2.AbstractC1404o;
import p170W2.C1840e;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.b */
/* JADX INFO: loaded from: classes.dex */
public class C3546b extends AbstractC3559g {

    /* JADX INFO: renamed from: a */
    private static final C3550f f14497a = new C3550f(null);

    /* JADX INFO: renamed from: b */
    static int f14498b = 1;

    C3546b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, AbstractC0886a.f3477b, googleSignInOptions, new C3588a());
    }

    /* JADX INFO: renamed from: f */
    private final synchronized int m17730f() {
        int i7;
        try {
            i7 = f14498b;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                C1840e c1840eM7604n = C1840e.m7604n();
                int iMo7609h = c1840eM7604n.mo7609h(applicationContext, 12451000);
                if (iMo7609h == 0) {
                    i7 = 4;
                    f14498b = 4;
                } else if (c1840eM7604n.mo7605b(applicationContext, iMo7609h, null) != null || DynamiteModule.m18222a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f14498b = 2;
                } else {
                    i7 = 3;
                    f14498b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }

    /* JADX INFO: renamed from: d */
    public Intent m17731d() {
        Context applicationContext = getApplicationContext();
        int iM17730f = m17730f();
        int i7 = iM17730f - 1;
        if (iM17730f == 0) {
            throw null;
        }
        if (i7 != 2) {
            return i7 != 3 ? AbstractC1404o.m5988c(applicationContext, (GoogleSignInOptions) getApiOptions()) : AbstractC1404o.m5986a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        return AbstractC1404o.m5987b(applicationContext, (GoogleSignInOptions) getApiOptions());
    }

    /* JADX INFO: renamed from: e */
    public Task m17732e() {
        return AbstractC3716r.m18061b(AbstractC1404o.m5990e(asGoogleApiClient(), getApplicationContext(), m17730f() == 3));
    }

    public Task signOut() {
        return AbstractC3716r.m18061b(AbstractC1404o.m5989d(asGoogleApiClient(), getApplicationContext(), m17730f() == 3));
    }

    C3546b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, AbstractC0886a.f3477b, googleSignInOptions, new AbstractC3559g.a.C7680a().m17769c(new C3588a()).m17767a());
    }
}
