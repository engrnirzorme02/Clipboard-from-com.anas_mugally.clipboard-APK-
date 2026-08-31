package p087K5;

import java.net.ProtocolException;

/* JADX INFO: renamed from: K5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0761j {

    /* JADX INFO: renamed from: a */
    public final EnumC0760i f3093a;

    /* JADX INFO: renamed from: b */
    public final int f3094b;

    /* JADX INFO: renamed from: c */
    public final String f3095c;

    public C0761j(EnumC0760i enumC0760i, int i7, String str) {
        this.f3093a = enumC0760i;
        this.f3094b = i7;
        this.f3095c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C0761j m3589a(String str) throws ProtocolException {
        EnumC0760i enumC0760i;
        int i7;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC0760i = EnumC0760i.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC0760i = EnumC0760i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC0760i = EnumC0760i.HTTP_1_0;
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i9 = Integer.parseInt(str.substring(i7, i8));
            if (str.length() <= i8) {
                strSubstring = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i7 + 4);
            }
            return new C0761j(enumC0760i, i9, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3093a == EnumC0760i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f3094b);
        if (this.f3095c != null) {
            sb.append(' ');
            sb.append(this.f3095c);
        }
        return sb.toString();
    }
}
