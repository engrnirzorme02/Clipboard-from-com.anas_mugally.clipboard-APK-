package p097M;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: renamed from: M.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0857a {

    /* JADX INFO: renamed from: d */
    static final InterfaceC0868l f3417d;

    /* JADX INFO: renamed from: e */
    private static final String f3418e;

    /* JADX INFO: renamed from: f */
    private static final String f3419f;

    /* JADX INFO: renamed from: g */
    static final C0857a f3420g;

    /* JADX INFO: renamed from: h */
    static final C0857a f3421h;

    /* JADX INFO: renamed from: a */
    private final boolean f3422a;

    /* JADX INFO: renamed from: b */
    private final int f3423b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0868l f3424c;

    /* JADX INFO: renamed from: M.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f3425a;

        /* JADX INFO: renamed from: b */
        private int f3426b;

        /* JADX INFO: renamed from: c */
        private InterfaceC0868l f3427c;

        public a() {
            m3980c(C0857a.m3971e(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: b */
        private static C0857a m3979b(boolean z7) {
            return z7 ? C0857a.f3421h : C0857a.f3420g;
        }

        /* JADX INFO: renamed from: c */
        private void m3980c(boolean z7) {
            this.f3425a = z7;
            this.f3427c = C0857a.f3417d;
            this.f3426b = 2;
        }

        /* JADX INFO: renamed from: a */
        public C0857a m3981a() {
            return (this.f3426b == 2 && this.f3427c == C0857a.f3417d) ? m3979b(this.f3425a) : new C0857a(this.f3425a, this.f3426b, this.f3427c);
        }
    }

    /* JADX INFO: renamed from: M.a$b */
    private static class b {

        /* JADX INFO: renamed from: f */
        private static final byte[] f3428f = new byte[1792];

        /* JADX INFO: renamed from: a */
        private final CharSequence f3429a;

        /* JADX INFO: renamed from: b */
        private final boolean f3430b;

        /* JADX INFO: renamed from: c */
        private final int f3431c;

        /* JADX INFO: renamed from: d */
        private int f3432d;

        /* JADX INFO: renamed from: e */
        private char f3433e;

        static {
            for (int i7 = 0; i7 < 1792; i7++) {
                f3428f[i7] = Character.getDirectionality(i7);
            }
        }

        b(CharSequence charSequence, boolean z7) {
            this.f3429a = charSequence;
            this.f3430b = z7;
            this.f3431c = charSequence.length();
        }

        /* JADX INFO: renamed from: c */
        private static byte m3982c(char c7) {
            return c7 < 1792 ? f3428f[c7] : Character.getDirectionality(c7);
        }

        /* JADX INFO: renamed from: f */
        private byte m3983f() {
            char cCharAt;
            int i7 = this.f3432d;
            do {
                int i8 = this.f3432d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3429a;
                int i9 = i8 - 1;
                this.f3432d = i9;
                cCharAt = charSequence.charAt(i9);
                this.f3433e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f3432d = i7;
            this.f3433e = ';';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: g */
        private byte m3984g() {
            char cCharAt;
            do {
                int i7 = this.f3432d;
                if (i7 >= this.f3431c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3429a;
                this.f3432d = i7 + 1;
                cCharAt = charSequence.charAt(i7);
                this.f3433e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: h */
        private byte m3985h() {
            char cCharAt;
            int i7 = this.f3432d;
            while (true) {
                int i8 = this.f3432d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3429a;
                int i9 = i8 - 1;
                this.f3432d = i9;
                char cCharAt2 = charSequence.charAt(i9);
                this.f3433e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.f3432d;
                        if (i10 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3429a;
                        int i11 = i10 - 1;
                        this.f3432d = i11;
                        cCharAt = charSequence2.charAt(i11);
                        this.f3433e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f3432d = i7;
            this.f3433e = '>';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: i */
        private byte m3986i() {
            char cCharAt;
            int i7 = this.f3432d;
            while (true) {
                int i8 = this.f3432d;
                if (i8 >= this.f3431c) {
                    this.f3432d = i7;
                    this.f3433e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f3429a;
                this.f3432d = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                this.f3433e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i9 = this.f3432d;
                        if (i9 >= this.f3431c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3429a;
                        this.f3432d = i9 + 1;
                        cCharAt = charSequence2.charAt(i9);
                        this.f3433e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        byte m3987a() {
            char cCharAt = this.f3429a.charAt(this.f3432d - 1);
            this.f3433e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f3429a, this.f3432d);
                this.f3432d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f3432d--;
            byte bM3982c = m3982c(this.f3433e);
            if (!this.f3430b) {
                return bM3982c;
            }
            char c7 = this.f3433e;
            if (c7 == '>') {
                return m3985h();
            }
            return c7 == ';' ? m3983f() : bM3982c;
        }

        /* JADX INFO: renamed from: b */
        byte m3988b() {
            char cCharAt = this.f3429a.charAt(this.f3432d);
            this.f3433e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f3429a, this.f3432d);
                this.f3432d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f3432d++;
            byte bM3982c = m3982c(this.f3433e);
            if (!this.f3430b) {
                return bM3982c;
            }
            char c7 = this.f3433e;
            if (c7 == '<') {
                return m3986i();
            }
            return c7 == '&' ? m3984g() : bM3982c;
        }

        /* JADX INFO: renamed from: d */
        int m3989d() {
            this.f3432d = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (this.f3432d < this.f3431c && i7 == 0) {
                byte bM3988b = m3988b();
                if (bM3988b != 0) {
                    if (bM3988b == 1 || bM3988b == 2) {
                        if (i9 == 0) {
                            return 1;
                        }
                    } else if (bM3988b != 9) {
                        switch (bM3988b) {
                            case 14:
                            case 15:
                                i9++;
                                i8 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i8 = 1;
                                continue;
                            case 18:
                                i9--;
                                i8 = 0;
                                continue;
                        }
                    }
                } else if (i9 == 0) {
                    return -1;
                }
                i7 = i9;
            }
            if (i7 == 0) {
                return 0;
            }
            if (i8 != 0) {
                return i8;
            }
            while (this.f3432d > 0) {
                switch (m3987a()) {
                    case 14:
                    case 15:
                        if (i7 == i9) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i7 == i9) {
                            return 1;
                        }
                        break;
                    case 18:
                        i9++;
                        continue;
                    default:
                        continue;
                }
                i9--;
            }
            return 0;
        }

        /* JADX INFO: renamed from: e */
        int m3990e() {
            this.f3432d = this.f3431c;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                while (this.f3432d > 0) {
                    byte bM3987a = m3987a();
                    if (bM3987a == 0) {
                        if (i7 == 0) {
                            return -1;
                        }
                        if (i8 == 0) {
                        }
                    } else if (bM3987a == 1 || bM3987a == 2) {
                        if (i7 == 0) {
                            return 1;
                        }
                        if (i8 == 0) {
                        }
                    } else if (bM3987a != 9) {
                        switch (bM3987a) {
                            case 14:
                            case 15:
                                if (i8 == i7) {
                                    return -1;
                                }
                                i7--;
                                break;
                            case 16:
                            case 17:
                                if (i8 == i7) {
                                    return 1;
                                }
                                i7--;
                                break;
                            case 18:
                                i7++;
                                break;
                            default:
                                if (i8 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        InterfaceC0868l interfaceC0868l = AbstractC0869m.f3445c;
        f3417d = interfaceC0868l;
        f3418e = Character.toString((char) 8206);
        f3419f = Character.toString((char) 8207);
        f3420g = new C0857a(false, 2, interfaceC0868l);
        f3421h = new C0857a(true, 2, interfaceC0868l);
    }

    C0857a(boolean z7, int i7, InterfaceC0868l interfaceC0868l) {
        this.f3422a = z7;
        this.f3423b = i7;
        this.f3424c = interfaceC0868l;
    }

    /* JADX INFO: renamed from: a */
    private static int m3968a(CharSequence charSequence) {
        return new b(charSequence, false).m3989d();
    }

    /* JADX INFO: renamed from: b */
    private static int m3969b(CharSequence charSequence) {
        return new b(charSequence, false).m3990e();
    }

    /* JADX INFO: renamed from: c */
    public static C0857a m3970c() {
        return new a().m3981a();
    }

    /* JADX INFO: renamed from: e */
    static boolean m3971e(Locale locale) {
        return AbstractC0870n.m4015a(locale) == 1;
    }

    /* JADX INFO: renamed from: f */
    private String m3972f(CharSequence charSequence, InterfaceC0868l interfaceC0868l) {
        boolean zMo4009a = interfaceC0868l.mo4009a(charSequence, 0, charSequence.length());
        if (!this.f3422a && (zMo4009a || m3969b(charSequence) == 1)) {
            return f3418e;
        }
        if (this.f3422a) {
            return (!zMo4009a || m3969b(charSequence) == -1) ? f3419f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    private String m3973g(CharSequence charSequence, InterfaceC0868l interfaceC0868l) {
        boolean zMo4009a = interfaceC0868l.mo4009a(charSequence, 0, charSequence.length());
        if (!this.f3422a && (zMo4009a || m3968a(charSequence) == 1)) {
            return f3418e;
        }
        if (this.f3422a) {
            return (!zMo4009a || m3968a(charSequence) == -1) ? f3419f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public boolean m3974d() {
        return (this.f3423b & 2) != 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m3975h(CharSequence charSequence) {
        return m3976i(charSequence, this.f3424c, true);
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m3976i(CharSequence charSequence, InterfaceC0868l interfaceC0868l, boolean z7) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo4009a = interfaceC0868l.mo4009a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m3974d() && z7) {
            spannableStringBuilder.append((CharSequence) m3973g(charSequence, zMo4009a ? AbstractC0869m.f3444b : AbstractC0869m.f3443a));
        }
        if (zMo4009a != this.f3422a) {
            spannableStringBuilder.append(zMo4009a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z7) {
            spannableStringBuilder.append((CharSequence) m3972f(charSequence, zMo4009a ? AbstractC0869m.f3444b : AbstractC0869m.f3443a));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j */
    public String m3977j(String str) {
        return m3978k(str, this.f3424c, true);
    }

    /* JADX INFO: renamed from: k */
    public String m3978k(String str, InterfaceC0868l interfaceC0868l, boolean z7) {
        if (str == null) {
            return null;
        }
        return m3976i(str, interfaceC0868l, z7).toString();
    }
}
