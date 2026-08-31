package p097M;

import java.util.Locale;

/* JADX INFO: renamed from: M.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869m {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0868l f3443a = new e(null, false);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0868l f3444b = new e(null, true);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0868l f3445c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0868l f3446d;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0868l f3447e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0868l f3448f;

    /* JADX INFO: renamed from: M.m$a */
    private static class a implements c {

        /* JADX INFO: renamed from: b */
        static final a f3449b = new a(true);

        /* JADX INFO: renamed from: a */
        private final boolean f3450a;

        private a(boolean z7) {
            this.f3450a = z7;
        }

        @Override // p097M.AbstractC0869m.c
        /* JADX INFO: renamed from: a */
        public int mo4012a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            boolean z7 = false;
            while (i7 < i9) {
                int iM4010a = AbstractC0869m.m4010a(Character.getDirectionality(charSequence.charAt(i7)));
                if (iM4010a != 0) {
                    if (iM4010a != 1) {
                        continue;
                    } else if (!this.f3450a) {
                        return 1;
                    }
                    i7++;
                    z7 = z7;
                } else if (this.f3450a) {
                    return 0;
                }
                z7 = true;
                i7++;
                z7 = z7;
            }
            if (z7) {
                return this.f3450a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: M.m$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        static final b f3451a = new b();

        private b() {
        }

        @Override // p097M.AbstractC0869m.c
        /* JADX INFO: renamed from: a */
        public int mo4012a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            int iM4011b = 2;
            while (i7 < i9 && iM4011b == 2) {
                iM4011b = AbstractC0869m.m4011b(Character.getDirectionality(charSequence.charAt(i7)));
                i7++;
            }
            return iM4011b;
        }
    }

    /* JADX INFO: renamed from: M.m$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        int mo4012a(CharSequence charSequence, int i7, int i8);
    }

    /* JADX INFO: renamed from: M.m$d */
    private static abstract class d implements InterfaceC0868l {

        /* JADX INFO: renamed from: a */
        private final c f3452a;

        d(c cVar) {
            this.f3452a = cVar;
        }

        /* JADX INFO: renamed from: c */
        private boolean m4013c(CharSequence charSequence, int i7, int i8) {
            int iMo4012a = this.f3452a.mo4012a(charSequence, i7, i8);
            if (iMo4012a == 0) {
                return true;
            }
            if (iMo4012a != 1) {
                return mo4014b();
            }
            return false;
        }

        @Override // p097M.InterfaceC0868l
        /* JADX INFO: renamed from: a */
        public boolean mo4009a(CharSequence charSequence, int i7, int i8) {
            if (charSequence == null || i7 < 0 || i8 < 0 || charSequence.length() - i8 < i7) {
                throw new IllegalArgumentException();
            }
            return this.f3452a == null ? mo4014b() : m4013c(charSequence, i7, i8);
        }

        /* JADX INFO: renamed from: b */
        protected abstract boolean mo4014b();
    }

    /* JADX INFO: renamed from: M.m$e */
    private static class e extends d {

        /* JADX INFO: renamed from: b */
        private final boolean f3453b;

        e(c cVar, boolean z7) {
            super(cVar);
            this.f3453b = z7;
        }

        @Override // p097M.AbstractC0869m.d
        /* JADX INFO: renamed from: b */
        protected boolean mo4014b() {
            return this.f3453b;
        }
    }

    /* JADX INFO: renamed from: M.m$f */
    private static class f extends d {

        /* JADX INFO: renamed from: b */
        static final f f3454b = new f();

        f() {
            super(null);
        }

        @Override // p097M.AbstractC0869m.d
        /* JADX INFO: renamed from: b */
        protected boolean mo4014b() {
            return AbstractC0870n.m4015a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3451a;
        f3445c = new e(bVar, false);
        f3446d = new e(bVar, true);
        f3447e = new e(a.f3449b, false);
        f3448f = f.f3454b;
    }

    /* JADX INFO: renamed from: a */
    static int m4010a(int i7) {
        if (i7 != 0) {
            return (i7 == 1 || i7 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    static int m4011b(int i7) {
        if (i7 != 0) {
            if (i7 == 1 || i7 == 2) {
                return 0;
            }
            switch (i7) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
