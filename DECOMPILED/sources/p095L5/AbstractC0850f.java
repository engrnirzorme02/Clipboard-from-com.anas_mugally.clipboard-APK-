package p095L5;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p072I6.AbstractC0659p;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0650g;

/* JADX INFO: renamed from: L5.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0850f {

    /* JADX INFO: renamed from: a */
    private static final C0651h f3362a = C0651h.m3084j(":");

    /* JADX INFO: renamed from: b */
    private static final C0848d[] f3363b;

    /* JADX INFO: renamed from: c */
    private static final Map f3364c;

    /* JADX INFO: renamed from: L5.f$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final List f3365a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0650g f3366b;

        /* JADX INFO: renamed from: c */
        private int f3367c;

        /* JADX INFO: renamed from: d */
        private int f3368d;

        /* JADX INFO: renamed from: e */
        C0848d[] f3369e;

        /* JADX INFO: renamed from: f */
        int f3370f;

        /* JADX INFO: renamed from: g */
        int f3371g;

        /* JADX INFO: renamed from: h */
        int f3372h;

        a(int i7, InterfaceC0640B interfaceC0640B) {
            this(i7, i7, interfaceC0640B);
        }

        /* JADX INFO: renamed from: a */
        private void m3896a() {
            int i7 = this.f3368d;
            int i8 = this.f3372h;
            if (i7 < i8) {
                if (i7 == 0) {
                    m3897b();
                } else {
                    m3899d(i8 - i7);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m3897b() {
            Arrays.fill(this.f3369e, (Object) null);
            this.f3370f = this.f3369e.length - 1;
            this.f3371g = 0;
            this.f3372h = 0;
        }

        /* JADX INFO: renamed from: c */
        private int m3898c(int i7) {
            return this.f3370f + 1 + i7;
        }

        /* JADX INFO: renamed from: d */
        private int m3899d(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f3369e.length;
                while (true) {
                    length--;
                    i8 = this.f3370f;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    int i10 = this.f3369e[length].f3356c;
                    i7 -= i10;
                    this.f3372h -= i10;
                    this.f3371g--;
                    i9++;
                }
                C0848d[] c0848dArr = this.f3369e;
                System.arraycopy(c0848dArr, i8 + 1, c0848dArr, i8 + 1 + i9, this.f3371g);
                this.f3370f += i9;
            }
            return i9;
        }

        /* JADX INFO: renamed from: f */
        private C0651h m3900f(int i7) throws IOException {
            if (m3902i(i7)) {
                return AbstractC0850f.f3363b[i7].f3354a;
            }
            int iM3898c = m3898c(i7 - AbstractC0850f.f3363b.length);
            if (iM3898c >= 0) {
                C0848d[] c0848dArr = this.f3369e;
                if (iM3898c < c0848dArr.length) {
                    return c0848dArr[iM3898c].f3354a;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* JADX INFO: renamed from: h */
        private void m3901h(int i7, C0848d c0848d) {
            this.f3365a.add(c0848d);
            int i8 = c0848d.f3356c;
            if (i7 != -1) {
                i8 -= this.f3369e[m3898c(i7)].f3356c;
            }
            int i9 = this.f3368d;
            if (i8 > i9) {
                m3897b();
                return;
            }
            int iM3899d = m3899d((this.f3372h + i8) - i9);
            if (i7 == -1) {
                int i10 = this.f3371g + 1;
                C0848d[] c0848dArr = this.f3369e;
                if (i10 > c0848dArr.length) {
                    C0848d[] c0848dArr2 = new C0848d[c0848dArr.length * 2];
                    System.arraycopy(c0848dArr, 0, c0848dArr2, c0848dArr.length, c0848dArr.length);
                    this.f3370f = this.f3369e.length - 1;
                    this.f3369e = c0848dArr2;
                }
                int i11 = this.f3370f;
                this.f3370f = i11 - 1;
                this.f3369e[i11] = c0848d;
                this.f3371g++;
            } else {
                this.f3369e[i7 + m3898c(i7) + iM3899d] = c0848d;
            }
            this.f3372h += i8;
        }

        /* JADX INFO: renamed from: i */
        private boolean m3902i(int i7) {
            return i7 >= 0 && i7 <= AbstractC0850f.f3363b.length - 1;
        }

        /* JADX INFO: renamed from: j */
        private int m3903j() {
            return this.f3366b.readByte() & 255;
        }

        /* JADX INFO: renamed from: m */
        private void m3904m(int i7) throws IOException {
            if (m3902i(i7)) {
                this.f3365a.add(AbstractC0850f.f3363b[i7]);
                return;
            }
            int iM3898c = m3898c(i7 - AbstractC0850f.f3363b.length);
            if (iM3898c >= 0) {
                C0848d[] c0848dArr = this.f3369e;
                if (iM3898c <= c0848dArr.length - 1) {
                    this.f3365a.add(c0848dArr[iM3898c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* JADX INFO: renamed from: o */
        private void m3905o(int i7) {
            m3901h(-1, new C0848d(m3900f(i7), m3911k()));
        }

        /* JADX INFO: renamed from: p */
        private void m3906p() {
            m3901h(-1, new C0848d(AbstractC0850f.m3894e(m3911k()), m3911k()));
        }

        /* JADX INFO: renamed from: q */
        private void m3907q(int i7) throws IOException {
            this.f3365a.add(new C0848d(m3900f(i7), m3911k()));
        }

        /* JADX INFO: renamed from: r */
        private void m3908r() throws IOException {
            this.f3365a.add(new C0848d(AbstractC0850f.m3894e(m3911k()), m3911k()));
        }

        /* JADX INFO: renamed from: e */
        public List m3909e() {
            ArrayList arrayList = new ArrayList(this.f3365a);
            this.f3365a.clear();
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        void m3910g(int i7) {
            this.f3367c = i7;
            this.f3368d = i7;
            m3896a();
        }

        /* JADX INFO: renamed from: k */
        C0651h m3911k() {
            int iM3903j = m3903j();
            boolean z7 = (iM3903j & 128) == 128;
            int iM3913n = m3913n(iM3903j, 127);
            return z7 ? C0651h.m3085x(C0852h.m3954f().m3955c(this.f3366b.mo3066s0(iM3913n))) : this.f3366b.mo3063r(iM3913n);
        }

        /* JADX INFO: renamed from: l */
        void m3912l() throws IOException {
            while (!this.f3366b.mo3009E()) {
                byte b7 = this.f3366b.readByte();
                int i7 = b7 & 255;
                if (i7 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b7 & 128) == 128) {
                    m3904m(m3913n(i7, 127) - 1);
                } else if (i7 == 64) {
                    m3906p();
                } else if ((b7 & 64) == 64) {
                    m3905o(m3913n(i7, 63) - 1);
                } else if ((b7 & 32) == 32) {
                    int iM3913n = m3913n(i7, 31);
                    this.f3368d = iM3913n;
                    if (iM3913n < 0 || iM3913n > this.f3367c) {
                        throw new IOException("Invalid dynamic table size update " + this.f3368d);
                    }
                    m3896a();
                } else if (i7 == 16 || i7 == 0) {
                    m3908r();
                } else {
                    m3907q(m3913n(i7, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        int m3913n(int i7, int i8) {
            int i9 = i7 & i8;
            if (i9 < i8) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int iM3903j = m3903j();
                if ((iM3903j & 128) == 0) {
                    return i8 + (iM3903j << i10);
                }
                i8 += (iM3903j & 127) << i10;
                i10 += 7;
            }
        }

        a(int i7, int i8, InterfaceC0640B interfaceC0640B) {
            this.f3365a = new ArrayList();
            C0848d[] c0848dArr = new C0848d[8];
            this.f3369e = c0848dArr;
            this.f3370f = c0848dArr.length - 1;
            this.f3371g = 0;
            this.f3372h = 0;
            this.f3367c = i7;
            this.f3368d = i8;
            this.f3366b = AbstractC0659p.m3132d(interfaceC0640B);
        }
    }

    /* JADX INFO: renamed from: L5.f$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        private final C0648e f3373a;

        /* JADX INFO: renamed from: b */
        private boolean f3374b;

        /* JADX INFO: renamed from: c */
        int f3375c;

        /* JADX INFO: renamed from: d */
        private int f3376d;

        /* JADX INFO: renamed from: e */
        private boolean f3377e;

        /* JADX INFO: renamed from: f */
        private int f3378f;

        /* JADX INFO: renamed from: g */
        C0848d[] f3379g;

        /* JADX INFO: renamed from: h */
        int f3380h;

        /* JADX INFO: renamed from: i */
        private int f3381i;

        /* JADX INFO: renamed from: j */
        private int f3382j;

        b(C0648e c0648e) {
            this(4096, false, c0648e);
        }

        /* JADX INFO: renamed from: a */
        private void m3914a() {
            Arrays.fill(this.f3379g, (Object) null);
            this.f3381i = this.f3379g.length - 1;
            this.f3380h = 0;
            this.f3382j = 0;
        }

        /* JADX INFO: renamed from: b */
        private int m3915b(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f3379g.length;
                while (true) {
                    length--;
                    i8 = this.f3381i;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    int i10 = this.f3379g[length].f3356c;
                    i7 -= i10;
                    this.f3382j -= i10;
                    this.f3380h--;
                    i9++;
                }
                C0848d[] c0848dArr = this.f3379g;
                System.arraycopy(c0848dArr, i8 + 1, c0848dArr, i8 + 1 + i9, this.f3380h);
                this.f3381i += i9;
            }
            return i9;
        }

        /* JADX INFO: renamed from: c */
        private void m3916c(C0848d c0848d) {
            int i7 = c0848d.f3356c;
            int i8 = this.f3378f;
            if (i7 > i8) {
                m3914a();
                return;
            }
            m3915b((this.f3382j + i7) - i8);
            int i9 = this.f3380h + 1;
            C0848d[] c0848dArr = this.f3379g;
            if (i9 > c0848dArr.length) {
                C0848d[] c0848dArr2 = new C0848d[c0848dArr.length * 2];
                System.arraycopy(c0848dArr, 0, c0848dArr2, c0848dArr.length, c0848dArr.length);
                this.f3381i = this.f3379g.length - 1;
                this.f3379g = c0848dArr2;
            }
            int i10 = this.f3381i;
            this.f3381i = i10 - 1;
            this.f3379g[i10] = c0848d;
            this.f3380h++;
            this.f3382j += i7;
        }

        /* JADX INFO: renamed from: d */
        void m3917d(C0651h c0651h) throws IOException {
            if (!this.f3374b || C0852h.m3954f().m3957e(c0651h.mo3093K()) >= c0651h.m3090F()) {
                m3919f(c0651h.m3090F(), 127, 0);
                this.f3373a.mo3017N0(c0651h);
                return;
            }
            C0648e c0648e = new C0648e();
            C0852h.m3954f().m3956d(c0651h.mo3093K(), c0648e.m3025T0());
            C0651h c0651hM3034a1 = c0648e.m3034a1();
            m3919f(c0651hM3034a1.m3090F(), 127, 128);
            this.f3373a.mo3017N0(c0651hM3034a1);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0070  */
        /* JADX INFO: renamed from: e */
        void m3918e(List list) throws IOException {
            int length;
            int length2;
            if (this.f3377e) {
                int i7 = this.f3376d;
                if (i7 < this.f3378f) {
                    m3919f(i7, 31, 32);
                }
                this.f3377e = false;
                this.f3376d = C3553a.e.API_PRIORITY_OTHER;
                m3919f(this.f3378f, 31, 32);
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0848d c0848d = (C0848d) list.get(i8);
                C0651h c0651hMo3092J = c0848d.f3354a.mo3092J();
                C0651h c0651h = c0848d.f3355b;
                Integer num = (Integer) AbstractC0850f.f3364c.get(c0651hMo3092J);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = length2;
                        length2 = -1;
                    } else if (AbstractC0850f.f3363b[iIntValue].f3355b.equals(c0651h)) {
                        length = length2;
                    } else if (AbstractC0850f.f3363b[length2].f3355b.equals(c0651h)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i9 = this.f3381i;
                    while (true) {
                        i9++;
                        C0848d[] c0848dArr = this.f3379g;
                        if (i9 >= c0848dArr.length) {
                            break;
                        }
                        if (c0848dArr[i9].f3354a.equals(c0651hMo3092J)) {
                            if (this.f3379g[i9].f3355b.equals(c0651h)) {
                                length2 = AbstractC0850f.f3363b.length + (i9 - this.f3381i);
                                break;
                            } else if (length == -1) {
                                length = (i9 - this.f3381i) + AbstractC0850f.f3363b.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m3919f(length2, 127, 128);
                } else if (length == -1) {
                    this.f3373a.mo3010F(64);
                    m3917d(c0651hMo3092J);
                    m3917d(c0651h);
                    m3916c(c0848d);
                } else if (!c0651hMo3092J.m3091I(AbstractC0850f.f3362a) || C0848d.f3351h.equals(c0651hMo3092J)) {
                    m3919f(length, 63, 64);
                    m3917d(c0651h);
                    m3916c(c0848d);
                } else {
                    m3919f(length, 15, 0);
                    m3917d(c0651h);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        void m3919f(int i7, int i8, int i9) {
            if (i7 < i8) {
                this.f3373a.mo3010F(i7 | i9);
                return;
            }
            this.f3373a.mo3010F(i9 | i8);
            int i10 = i7 - i8;
            while (i10 >= 128) {
                this.f3373a.mo3010F(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.f3373a.mo3010F(i10);
        }

        b(int i7, boolean z7, C0648e c0648e) {
            this.f3376d = C3553a.e.API_PRIORITY_OTHER;
            C0848d[] c0848dArr = new C0848d[8];
            this.f3379g = c0848dArr;
            this.f3381i = c0848dArr.length - 1;
            this.f3375c = i7;
            this.f3378f = i7;
            this.f3374b = z7;
            this.f3373a = c0648e;
        }
    }

    static {
        C0848d c0848d = new C0848d(C0848d.f3351h, "");
        C0651h c0651h = C0848d.f3348e;
        C0848d c0848d2 = new C0848d(c0651h, "GET");
        C0848d c0848d3 = new C0848d(c0651h, "POST");
        C0651h c0651h2 = C0848d.f3349f;
        C0848d c0848d4 = new C0848d(c0651h2, "/");
        C0848d c0848d5 = new C0848d(c0651h2, "/index.html");
        C0651h c0651h3 = C0848d.f3350g;
        C0848d c0848d6 = new C0848d(c0651h3, "http");
        C0848d c0848d7 = new C0848d(c0651h3, "https");
        C0651h c0651h4 = C0848d.f3347d;
        f3363b = new C0848d[]{c0848d, c0848d2, c0848d3, c0848d4, c0848d5, c0848d6, c0848d7, new C0848d(c0651h4, "200"), new C0848d(c0651h4, "204"), new C0848d(c0651h4, "206"), new C0848d(c0651h4, "304"), new C0848d(c0651h4, "400"), new C0848d(c0651h4, "404"), new C0848d(c0651h4, "500"), new C0848d("accept-charset", ""), new C0848d("accept-encoding", "gzip, deflate"), new C0848d("accept-language", ""), new C0848d("accept-ranges", ""), new C0848d("accept", ""), new C0848d("access-control-allow-origin", ""), new C0848d("age", ""), new C0848d("allow", ""), new C0848d("authorization", ""), new C0848d("cache-control", ""), new C0848d("content-disposition", ""), new C0848d("content-encoding", ""), new C0848d("content-language", ""), new C0848d("content-length", ""), new C0848d("content-location", ""), new C0848d("content-range", ""), new C0848d("content-type", ""), new C0848d("cookie", ""), new C0848d("date", ""), new C0848d("etag", ""), new C0848d("expect", ""), new C0848d("expires", ""), new C0848d("from", ""), new C0848d("host", ""), new C0848d("if-match", ""), new C0848d("if-modified-since", ""), new C0848d("if-none-match", ""), new C0848d("if-range", ""), new C0848d("if-unmodified-since", ""), new C0848d("last-modified", ""), new C0848d("link", ""), new C0848d("location", ""), new C0848d("max-forwards", ""), new C0848d("proxy-authenticate", ""), new C0848d("proxy-authorization", ""), new C0848d("range", ""), new C0848d("referer", ""), new C0848d("refresh", ""), new C0848d("retry-after", ""), new C0848d("server", ""), new C0848d("set-cookie", ""), new C0848d("strict-transport-security", ""), new C0848d("transfer-encoding", ""), new C0848d("user-agent", ""), new C0848d("vary", ""), new C0848d("via", ""), new C0848d("www-authenticate", "")};
        f3364c = m3895f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static C0651h m3894e(C0651h c0651h) throws IOException {
        int iM3090F = c0651h.m3090F();
        for (int i7 = 0; i7 < iM3090F; i7++) {
            byte bM3099k = c0651h.m3099k(i7);
            if (bM3099k >= 65 && bM3099k <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c0651h.m3094M());
            }
        }
        return c0651h;
    }

    /* JADX INFO: renamed from: f */
    private static Map m3895f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f3363b.length);
        int i7 = 0;
        while (true) {
            C0848d[] c0848dArr = f3363b;
            if (i7 >= c0848dArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c0848dArr[i7].f3354a)) {
                linkedHashMap.put(c0848dArr[i7].f3354a, Integer.valueOf(i7));
            }
            i7++;
        }
    }
}
