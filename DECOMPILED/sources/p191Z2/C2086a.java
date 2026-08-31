package p191Z2;

import android.util.Log;
import com.google.android.gms.common.internal.C3700j;
import java.util.Locale;

/* JADX INFO: renamed from: Z2.a */
/* JADX INFO: loaded from: classes.dex */
public class C2086a {

    /* JADX INFO: renamed from: a */
    private final String f6874a;

    /* JADX INFO: renamed from: b */
    private final String f6875b;

    /* JADX INFO: renamed from: c */
    private final C3700j f6876c;

    /* JADX INFO: renamed from: d */
    private final int f6877d;

    public C2086a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f6875b = string;
        this.f6874a = str;
        this.f6876c = new C3700j(str);
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f6874a, i7)) {
            i7++;
        }
        this.f6877d = i7;
    }

    /* JADX INFO: renamed from: a */
    public void m8613a(String str, Object... objArr) {
        if (m8618f(3)) {
            Log.d(this.f6874a, m8616d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8614b(String str, Throwable th, Object... objArr) {
        Log.e(this.f6874a, m8616d(str, objArr), th);
    }

    /* JADX INFO: renamed from: c */
    public void m8615c(String str, Object... objArr) {
        Log.e(this.f6874a, m8616d(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    protected String m8616d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f6875b.concat(str);
    }

    /* JADX INFO: renamed from: e */
    public void m8617e(String str, Object... objArr) {
        Log.i(this.f6874a, m8616d(str, objArr));
    }

    /* JADX INFO: renamed from: f */
    public boolean m8618f(int i7) {
        return this.f6877d <= i7;
    }

    /* JADX INFO: renamed from: g */
    public void m8619g(String str, Object... objArr) {
        if (m8618f(2)) {
            Log.v(this.f6874a, m8616d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m8620h(String str, Object... objArr) {
        Log.w(this.f6874a, m8616d(str, objArr));
    }

    /* JADX INFO: renamed from: i */
    public void m8621i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f6874a, m8616d(str, objArr), th);
    }

    /* JADX INFO: renamed from: j */
    public void m8622j(Throwable th) {
        Log.wtf(this.f6874a, th);
    }
}
