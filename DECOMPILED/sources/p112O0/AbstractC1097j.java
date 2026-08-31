package p112O0;

import android.util.Log;

/* JADX INFO: renamed from: O0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1097j {

    /* JADX INFO: renamed from: a */
    private static AbstractC1097j f3952a = null;

    /* JADX INFO: renamed from: b */
    private static final int f3953b = 20;

    /* JADX INFO: renamed from: O0.j$a */
    public static class a extends AbstractC1097j {

        /* JADX INFO: renamed from: c */
        private int f3954c;

        public a(int i7) {
            super(i7);
            this.f3954c = i7;
        }

        @Override // p112O0.AbstractC1097j
        /* JADX INFO: renamed from: a */
        public void mo4847a(String str, String str2, Throwable... thArr) {
            if (this.f3954c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // p112O0.AbstractC1097j
        /* JADX INFO: renamed from: b */
        public void mo4848b(String str, String str2, Throwable... thArr) {
            if (this.f3954c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // p112O0.AbstractC1097j
        /* JADX INFO: renamed from: d */
        public void mo4849d(String str, String str2, Throwable... thArr) {
            if (this.f3954c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // p112O0.AbstractC1097j
        /* JADX INFO: renamed from: g */
        public void mo4850g(String str, String str2, Throwable... thArr) {
            if (this.f3954c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // p112O0.AbstractC1097j
        /* JADX INFO: renamed from: h */
        public void mo4851h(String str, String str2, Throwable... thArr) {
            if (this.f3954c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public AbstractC1097j(int i7) {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized AbstractC1097j m4844c() {
        try {
            if (f3952a == null) {
                f3952a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3952a;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m4845e(AbstractC1097j abstractC1097j) {
        f3952a = abstractC1097j;
    }

    /* JADX INFO: renamed from: f */
    public static String m4846f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i7 = f3953b;
        if (length >= i7) {
            sb.append(str.substring(0, i7));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4847a(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: b */
    public abstract void mo4848b(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo4849d(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: g */
    public abstract void mo4850g(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: h */
    public abstract void mo4851h(String str, String str2, Throwable... thArr);
}
