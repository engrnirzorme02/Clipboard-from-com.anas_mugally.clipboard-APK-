package p142S2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: S2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1392c {

    /* JADX INFO: renamed from: c */
    private static final Lock f4897c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    private static C1392c f4898d;

    /* JADX INFO: renamed from: a */
    private final Lock f4899a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f4900b;

    C1392c(Context context) {
        this.f4900b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: b */
    public static C1392c m5970b(Context context) {
        AbstractC3718s.m18083l(context);
        f4897c.lock();
        try {
            if (f4898d == null) {
                f4898d = new C1392c(context.getApplicationContext());
            }
            return f4898d;
        } finally {
            f4897c.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    private static final String m5971i(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: a */
    public void m5972a() {
        this.f4899a.lock();
        try {
            this.f4900b.edit().clear().apply();
        } finally {
            this.f4899a.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public GoogleSignInAccount m5973c() {
        String strM5977g;
        String strM5977g2 = m5977g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM5977g2) && (strM5977g = m5977g(m5971i("googleSignInAccount", strM5977g2))) != null) {
            try {
                return GoogleSignInAccount.m17685d0(strM5977g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public GoogleSignInOptions m5974d() {
        String strM5977g;
        String strM5977g2 = m5977g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM5977g2) && (strM5977g = m5977g(m5971i("googleSignInOptions", strM5977g2))) != null) {
            try {
                return GoogleSignInOptions.m17698c0(strM5977g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m5975e() {
        return m5977g("refreshToken");
    }

    /* JADX INFO: renamed from: f */
    public void m5976f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC3718s.m18083l(googleSignInAccount);
        AbstractC3718s.m18083l(googleSignInOptions);
        m5978h("defaultGoogleSignInAccount", googleSignInAccount.m17695e0());
        AbstractC3718s.m18083l(googleSignInAccount);
        AbstractC3718s.m18083l(googleSignInOptions);
        String strM17695e0 = googleSignInAccount.m17695e0();
        m5978h(m5971i("googleSignInAccount", strM17695e0), googleSignInAccount.m17696f0());
        m5978h(m5971i("googleSignInOptions", strM17695e0), googleSignInOptions.m17717g0());
    }

    /* JADX INFO: renamed from: g */
    protected final String m5977g(String str) {
        this.f4899a.lock();
        try {
            return this.f4900b.getString(str, null);
        } finally {
            this.f4899a.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    protected final void m5978h(String str, String str2) {
        this.f4899a.lock();
        try {
            this.f4900b.edit().putString(str, str2).apply();
        } finally {
            this.f4899a.unlock();
        }
    }
}
