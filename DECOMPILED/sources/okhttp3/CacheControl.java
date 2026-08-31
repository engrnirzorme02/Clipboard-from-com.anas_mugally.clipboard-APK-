package okhttp3;

import com.google.android.gms.common.api.C3553a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n */
    public static final Companion f25052n = new Companion(null);

    /* JADX INFO: renamed from: o */
    public static final CacheControl f25053o = new Builder().m28359d().m28357a();

    /* JADX INFO: renamed from: p */
    public static final CacheControl f25054p = new Builder().m28360e().m28358c(C3553a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).m28357a();

    /* JADX INFO: renamed from: a */
    private final boolean f25055a;

    /* JADX INFO: renamed from: b */
    private final boolean f25056b;

    /* JADX INFO: renamed from: c */
    private final int f25057c;

    /* JADX INFO: renamed from: d */
    private final int f25058d;

    /* JADX INFO: renamed from: e */
    private final boolean f25059e;

    /* JADX INFO: renamed from: f */
    private final boolean f25060f;

    /* JADX INFO: renamed from: g */
    private final boolean f25061g;

    /* JADX INFO: renamed from: h */
    private final int f25062h;

    /* JADX INFO: renamed from: i */
    private final int f25063i;

    /* JADX INFO: renamed from: j */
    private final boolean f25064j;

    /* JADX INFO: renamed from: k */
    private final boolean f25065k;

    /* JADX INFO: renamed from: l */
    private final boolean f25066l;

    /* JADX INFO: renamed from: m */
    private String f25067m;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private boolean f25068a;

        /* JADX INFO: renamed from: b */
        private boolean f25069b;

        /* JADX INFO: renamed from: c */
        private int f25070c = -1;

        /* JADX INFO: renamed from: d */
        private int f25071d = -1;

        /* JADX INFO: renamed from: e */
        private int f25072e = -1;

        /* JADX INFO: renamed from: f */
        private boolean f25073f;

        /* JADX INFO: renamed from: g */
        private boolean f25074g;

        /* JADX INFO: renamed from: h */
        private boolean f25075h;

        /* JADX INFO: renamed from: b */
        private final int m28356b(long j7) {
            return j7 > 2147483647L ? C3553a.e.API_PRIORITY_OTHER : (int) j7;
        }

        /* JADX INFO: renamed from: a */
        public final CacheControl m28357a() {
            return new CacheControl(this.f25068a, this.f25069b, this.f25070c, -1, false, false, false, this.f25071d, this.f25072e, this.f25073f, this.f25074g, this.f25075h, null, null);
        }

        /* JADX INFO: renamed from: c */
        public final Builder m28358c(int i7, TimeUnit timeUnit) {
            AbstractC6118n.m27187e(timeUnit, "timeUnit");
            if (i7 >= 0) {
                this.f25071d = m28356b(timeUnit.toSeconds(i7));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i7).toString());
        }

        /* JADX INFO: renamed from: d */
        public final Builder m28359d() {
            this.f25068a = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final Builder m28360e() {
            this.f25073f = true;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final int m28361a(String str, String str2, int i7) {
            int length = str.length();
            while (i7 < length) {
                if (AbstractC6406h.m27587P(str2, str.charAt(i7), false, 2, null)) {
                    return i7;
                }
                i7++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:41:0x0106  */
        /* JADX WARN: Code duplicated, block: B:43:0x010e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0114  */
        /* JADX WARN: Code duplicated, block: B:46:0x011c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
        /* JADX WARN: Code duplicated, block: B:49:0x012a  */
        /* JADX WARN: Code duplicated, block: B:50:0x0130  */
        /* JADX WARN: Code duplicated, block: B:52:0x0138  */
        /* JADX WARN: Code duplicated, block: B:53:0x013f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0147  */
        /* JADX WARN: Code duplicated, block: B:56:0x014f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0157  */
        /* JADX WARN: Code duplicated, block: B:59:0x015d  */
        /* JADX WARN: Code duplicated, block: B:61:0x0166  */
        /* JADX WARN: Code duplicated, block: B:62:0x016e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0176  */
        /* JADX WARN: Code duplicated, block: B:65:0x017e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0186  */
        /* JADX INFO: renamed from: b */
        public final CacheControl m28362b(Headers headers) {
            int iM28361a;
            int iM28361a2;
            boolean z7;
            String string;
            int i7;
            String str;
            String string2;
            Headers headers2 = headers;
            AbstractC6118n.m27187e(headers2, "headers");
            int size = headers2.size();
            boolean z8 = true;
            boolean z9 = true;
            int i8 = 0;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            int iM28756Y = -1;
            int iM28756Y2 = -1;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int iM28756Y3 = -1;
            int iM28756Y4 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            while (i8 < size) {
                String strM28478b = headers2.m28478b(i8);
                String strM28480g = headers2.m28480g(i8);
                if (AbstractC6406h.m27564w(strM28478b, "Cache-Control", z8)) {
                    if (str2 == null) {
                        str2 = strM28480g;
                    }
                    iM28361a = 0;
                    while (iM28361a < strM28480g.length()) {
                        iM28361a2 = m28361a(strM28480g, "=,;", iM28361a);
                        String strSubstring = strM28480g.substring(iM28361a, iM28361a2);
                        z7 = z8;
                        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = AbstractC6406h.m27594S0(strSubstring).toString();
                        if (iM28361a2 != strM28480g.length()) {
                            i7 = size;
                            if (strM28480g.charAt(iM28361a2) == ',' && strM28480g.charAt(iM28361a2) != ';') {
                                int iM28735D = Util.m28735D(strM28480g, iM28361a2 + 1);
                                if (iM28735D >= strM28480g.length() || strM28480g.charAt(iM28735D) != '\"') {
                                    str = strM28480g;
                                    iM28361a = m28361a(str, ",;", iM28735D);
                                    String strSubstring2 = str.substring(iM28735D, iM28361a);
                                    AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = AbstractC6406h.m27594S0(strSubstring2).toString();
                                } else {
                                    int i9 = iM28735D + 1;
                                    String str3 = strM28480g;
                                    int iZ = AbstractC6406h.m27601Z(str3, '\"', i9, false, 4, null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i9, iZ);
                                    AbstractC6118n.m27186d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iM28361a = iZ + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (AbstractC6406h.m27564w("no-cache", string, z7)) {
                                z8 = z7;
                                z10 = z8;
                            } else if (AbstractC6406h.m27564w("no-store", string, z7)) {
                                z8 = z7;
                                z11 = z8;
                            } else {
                                if (AbstractC6406h.m27564w("max-age", string, z7)) {
                                    iM28756Y = Util.m28756Y(string2, -1);
                                } else if (AbstractC6406h.m27564w("s-maxage", string, z7)) {
                                    iM28756Y2 = Util.m28756Y(string2, -1);
                                } else if (AbstractC6406h.m27564w("private", string, z7)) {
                                    z8 = z7;
                                    z12 = z8;
                                } else if (AbstractC6406h.m27564w("public", string, z7)) {
                                    z8 = z7;
                                    z13 = z8;
                                } else if (AbstractC6406h.m27564w("must-revalidate", string, z7)) {
                                    z8 = z7;
                                    z14 = z8;
                                } else if (AbstractC6406h.m27564w("max-stale", string, z7)) {
                                    iM28756Y3 = Util.m28756Y(string2, C3553a.e.API_PRIORITY_OTHER);
                                } else if (AbstractC6406h.m27564w("min-fresh", string, z7)) {
                                    iM28756Y4 = Util.m28756Y(string2, -1);
                                } else if (AbstractC6406h.m27564w("only-if-cached", string, z7)) {
                                    z8 = z7;
                                    z15 = z8;
                                } else if (AbstractC6406h.m27564w("no-transform", string, z7)) {
                                    z8 = z7;
                                    z16 = z8;
                                } else if (AbstractC6406h.m27564w("immutable", string, z7)) {
                                    z8 = z7;
                                    z17 = z8;
                                }
                                z8 = z7;
                            }
                            strM28480g = str;
                            size = i7;
                        } else {
                            i7 = size;
                        }
                        str = strM28480g;
                        iM28361a = iM28361a2 + 1;
                        string2 = null;
                        if (AbstractC6406h.m27564w("no-cache", string, z7)) {
                            z8 = z7;
                            z10 = z8;
                        } else if (AbstractC6406h.m27564w("no-store", string, z7)) {
                            z8 = z7;
                            z11 = z8;
                        } else {
                            if (AbstractC6406h.m27564w("max-age", string, z7)) {
                                iM28756Y = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("s-maxage", string, z7)) {
                                iM28756Y2 = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("private", string, z7)) {
                                z8 = z7;
                                z12 = z8;
                            } else if (AbstractC6406h.m27564w("public", string, z7)) {
                                z8 = z7;
                                z13 = z8;
                            } else if (AbstractC6406h.m27564w("must-revalidate", string, z7)) {
                                z8 = z7;
                                z14 = z8;
                            } else if (AbstractC6406h.m27564w("max-stale", string, z7)) {
                                iM28756Y3 = Util.m28756Y(string2, C3553a.e.API_PRIORITY_OTHER);
                            } else if (AbstractC6406h.m27564w("min-fresh", string, z7)) {
                                iM28756Y4 = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("only-if-cached", string, z7)) {
                                z8 = z7;
                                z15 = z8;
                            } else if (AbstractC6406h.m27564w("no-transform", string, z7)) {
                                z8 = z7;
                                z16 = z8;
                            } else if (AbstractC6406h.m27564w("immutable", string, z7)) {
                                z8 = z7;
                                z17 = z8;
                            }
                            z8 = z7;
                        }
                        strM28480g = str;
                        size = i7;
                    }
                    i8++;
                    headers2 = headers;
                    z8 = z8;
                    size = size;
                } else {
                    if (AbstractC6406h.m27564w(strM28478b, "Pragma", z8)) {
                    }
                    i8++;
                    headers2 = headers;
                    z8 = z8;
                    size = size;
                }
                z9 = false;
                iM28361a = 0;
                while (iM28361a < strM28480g.length()) {
                    iM28361a2 = m28361a(strM28480g, "=,;", iM28361a);
                    String strSubstring4 = strM28480g.substring(iM28361a, iM28361a2);
                    z7 = z8;
                    AbstractC6118n.m27186d(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = AbstractC6406h.m27594S0(strSubstring4).toString();
                    if (iM28361a2 != strM28480g.length()) {
                        i7 = size;
                        if (strM28480g.charAt(iM28361a2) == ',') {
                        }
                        if (AbstractC6406h.m27564w("no-cache", string, z7)) {
                            z8 = z7;
                            z10 = z8;
                        } else if (AbstractC6406h.m27564w("no-store", string, z7)) {
                            z8 = z7;
                            z11 = z8;
                        } else {
                            if (AbstractC6406h.m27564w("max-age", string, z7)) {
                                iM28756Y = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("s-maxage", string, z7)) {
                                iM28756Y2 = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("private", string, z7)) {
                                z8 = z7;
                                z12 = z8;
                            } else if (AbstractC6406h.m27564w("public", string, z7)) {
                                z8 = z7;
                                z13 = z8;
                            } else if (AbstractC6406h.m27564w("must-revalidate", string, z7)) {
                                z8 = z7;
                                z14 = z8;
                            } else if (AbstractC6406h.m27564w("max-stale", string, z7)) {
                                iM28756Y3 = Util.m28756Y(string2, C3553a.e.API_PRIORITY_OTHER);
                            } else if (AbstractC6406h.m27564w("min-fresh", string, z7)) {
                                iM28756Y4 = Util.m28756Y(string2, -1);
                            } else if (AbstractC6406h.m27564w("only-if-cached", string, z7)) {
                                z8 = z7;
                                z15 = z8;
                            } else if (AbstractC6406h.m27564w("no-transform", string, z7)) {
                                z8 = z7;
                                z16 = z8;
                            } else if (AbstractC6406h.m27564w("immutable", string, z7)) {
                                z8 = z7;
                                z17 = z8;
                            }
                            z8 = z7;
                        }
                        strM28480g = str;
                        size = i7;
                    } else {
                        i7 = size;
                    }
                    str = strM28480g;
                    iM28361a = iM28361a2 + 1;
                    string2 = null;
                    if (AbstractC6406h.m27564w("no-cache", string, z7)) {
                        z8 = z7;
                        z10 = z8;
                    } else if (AbstractC6406h.m27564w("no-store", string, z7)) {
                        z8 = z7;
                        z11 = z8;
                    } else {
                        if (AbstractC6406h.m27564w("max-age", string, z7)) {
                            iM28756Y = Util.m28756Y(string2, -1);
                        } else if (AbstractC6406h.m27564w("s-maxage", string, z7)) {
                            iM28756Y2 = Util.m28756Y(string2, -1);
                        } else if (AbstractC6406h.m27564w("private", string, z7)) {
                            z8 = z7;
                            z12 = z8;
                        } else if (AbstractC6406h.m27564w("public", string, z7)) {
                            z8 = z7;
                            z13 = z8;
                        } else if (AbstractC6406h.m27564w("must-revalidate", string, z7)) {
                            z8 = z7;
                            z14 = z8;
                        } else if (AbstractC6406h.m27564w("max-stale", string, z7)) {
                            iM28756Y3 = Util.m28756Y(string2, C3553a.e.API_PRIORITY_OTHER);
                        } else if (AbstractC6406h.m27564w("min-fresh", string, z7)) {
                            iM28756Y4 = Util.m28756Y(string2, -1);
                        } else if (AbstractC6406h.m27564w("only-if-cached", string, z7)) {
                            z8 = z7;
                            z15 = z8;
                        } else if (AbstractC6406h.m27564w("no-transform", string, z7)) {
                            z8 = z7;
                            z16 = z8;
                        } else if (AbstractC6406h.m27564w("immutable", string, z7)) {
                            z8 = z7;
                            z17 = z8;
                        }
                        z8 = z7;
                    }
                    strM28480g = str;
                    size = i7;
                }
                i8++;
                headers2 = headers;
                z8 = z8;
                size = size;
            }
            return new CacheControl(z10, z11, iM28756Y, iM28756Y2, z12, z13, z14, iM28756Y3, iM28756Y4, z15, z16, z17, !z9 ? null : str2, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str, AbstractC6112h abstractC6112h) {
        this(z7, z8, i7, i8, z9, z10, z11, i9, i10, z12, z13, z14, str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28347a() {
        return this.f25059e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28348b() {
        return this.f25060f;
    }

    /* JADX INFO: renamed from: c */
    public final int m28349c() {
        return this.f25057c;
    }

    /* JADX INFO: renamed from: d */
    public final int m28350d() {
        return this.f25062h;
    }

    /* JADX INFO: renamed from: e */
    public final int m28351e() {
        return this.f25063i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28352f() {
        return this.f25061g;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28353g() {
        return this.f25055a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28354h() {
        return this.f25056b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28355i() {
        return this.f25064j;
    }

    public String toString() {
        String str = this.f25067m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f25055a) {
            sb.append("no-cache, ");
        }
        if (this.f25056b) {
            sb.append("no-store, ");
        }
        if (this.f25057c != -1) {
            sb.append("max-age=");
            sb.append(this.f25057c);
            sb.append(", ");
        }
        if (this.f25058d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f25058d);
            sb.append(", ");
        }
        if (this.f25059e) {
            sb.append("private, ");
        }
        if (this.f25060f) {
            sb.append("public, ");
        }
        if (this.f25061g) {
            sb.append("must-revalidate, ");
        }
        if (this.f25062h != -1) {
            sb.append("max-stale=");
            sb.append(this.f25062h);
            sb.append(", ");
        }
        if (this.f25063i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f25063i);
            sb.append(", ");
        }
        if (this.f25064j) {
            sb.append("only-if-cached, ");
        }
        if (this.f25065k) {
            sb.append("no-transform, ");
        }
        if (this.f25066l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        this.f25067m = string;
        return string;
    }

    private CacheControl(boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.f25055a = z7;
        this.f25056b = z8;
        this.f25057c = i7;
        this.f25058d = i8;
        this.f25059e = z9;
        this.f25060f = z10;
        this.f25061g = z11;
        this.f25062h = i9;
        this.f25063i = i10;
        this.f25064j = z12;
        this.f25065k = z13;
        this.f25066l = z14;
        this.f25067m = str;
    }
}
