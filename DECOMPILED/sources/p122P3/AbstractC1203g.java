package p122P3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: P3.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1203g {

    /* JADX INFO: renamed from: P3.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f4284a;

        /* JADX INFO: renamed from: b */
        private final C7639b f4285b;

        /* JADX INFO: renamed from: c */
        private C7639b f4286c;

        /* JADX INFO: renamed from: d */
        private boolean f4287d;

        /* JADX INFO: renamed from: e */
        private boolean f4288e;

        /* JADX INFO: renamed from: P3.g$b$a */
        private static final class a extends C7639b {
            private a() {
                super();
            }
        }

        /* JADX INFO: renamed from: P3.g$b$b, reason: collision with other inner class name */
        private static class C7639b {

            /* JADX INFO: renamed from: a */
            String f4289a;

            /* JADX INFO: renamed from: b */
            Object f4290b;

            /* JADX INFO: renamed from: c */
            C7639b f4291c;

            private C7639b() {
            }
        }

        /* JADX INFO: renamed from: f */
        private C7639b m5268f() {
            C7639b c7639b = new C7639b();
            this.f4286c.f4291c = c7639b;
            this.f4286c = c7639b;
            return c7639b;
        }

        /* JADX INFO: renamed from: g */
        private b m5269g(Object obj) {
            m5268f().f4290b = obj;
            return this;
        }

        /* JADX INFO: renamed from: h */
        private b m5270h(String str, Object obj) {
            C7639b c7639bM5268f = m5268f();
            c7639bM5268f.f4290b = obj;
            c7639bM5268f.f4289a = (String) AbstractC1209m.m5302n(str);
            return this;
        }

        /* JADX INFO: renamed from: i */
        private a m5271i() {
            a aVar = new a();
            this.f4286c.f4291c = aVar;
            this.f4286c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: j */
        private b m5272j(String str, Object obj) {
            a aVarM5271i = m5271i();
            aVarM5271i.f4290b = obj;
            aVarM5271i.f4289a = (String) AbstractC1209m.m5302n(str);
            return this;
        }

        /* JADX INFO: renamed from: l */
        private static boolean m5273l(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof AbstractC1206j) {
                return !((AbstractC1206j) obj).mo5254c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* JADX INFO: renamed from: a */
        public b m5274a(String str, double d7) {
            return m5272j(str, String.valueOf(d7));
        }

        /* JADX INFO: renamed from: b */
        public b m5275b(String str, int i7) {
            return m5272j(str, String.valueOf(i7));
        }

        /* JADX INFO: renamed from: c */
        public b m5276c(String str, long j7) {
            return m5272j(str, String.valueOf(j7));
        }

        /* JADX INFO: renamed from: d */
        public b m5277d(String str, Object obj) {
            return m5270h(str, obj);
        }

        /* JADX INFO: renamed from: e */
        public b m5278e(String str, boolean z7) {
            return m5272j(str, String.valueOf(z7));
        }

        /* JADX INFO: renamed from: k */
        public b m5279k(Object obj) {
            return m5269g(obj);
        }

        /* JADX INFO: renamed from: m */
        public b m5280m() {
            this.f4287d = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z7 = this.f4287d;
            boolean z8 = this.f4288e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f4284a);
            sb.append('{');
            String str2 = "";
            for (C7639b c7639b = this.f4285b.f4291c; c7639b != null; c7639b = c7639b.f4291c) {
                Object obj = c7639b.f4290b;
                if (c7639b instanceof a) {
                    sb.append(str2);
                    str = c7639b.f4289a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z7) {
                        sb.append(str2);
                        str = c7639b.f4289a;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null) {
                            sb.append(obj);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z8 || !m5273l(obj)) {
                    sb.append(str2);
                    str = c7639b.f4289a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            C7639b c7639b = new C7639b();
            this.f4285b = c7639b;
            this.f4286c = c7639b;
            this.f4287d = false;
            this.f4288e = false;
            this.f4284a = (String) AbstractC1209m.m5302n(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m5266a(Class cls) {
        return new b(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public static b m5267b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
