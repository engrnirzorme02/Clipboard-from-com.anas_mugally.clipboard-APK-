package okhttp3.internal.http2;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.AbstractC0659p;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0650g;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class Hpack {

    /* JADX INFO: renamed from: a */
    public static final Hpack f25801a;

    /* JADX INFO: renamed from: b */
    private static final Header[] f25802b;

    /* JADX INFO: renamed from: c */
    private static final Map f25803c;

    static {
        Hpack hpack = new Hpack();
        f25801a = hpack;
        Header header = new Header(Header.f25797j, "");
        C0651h c0651h = Header.f25794g;
        Header header2 = new Header(c0651h, "GET");
        Header header3 = new Header(c0651h, "POST");
        C0651h c0651h2 = Header.f25795h;
        Header header4 = new Header(c0651h2, "/");
        Header header5 = new Header(c0651h2, "/index.html");
        C0651h c0651h3 = Header.f25796i;
        Header header6 = new Header(c0651h3, "http");
        Header header7 = new Header(c0651h3, "https");
        C0651h c0651h4 = Header.f25793f;
        f25802b = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(c0651h4, "200"), new Header(c0651h4, "204"), new Header(c0651h4, "206"), new Header(c0651h4, "304"), new Header(c0651h4, "400"), new Header(c0651h4, "404"), new Header(c0651h4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f25803c = hpack.m29118d();
    }

    private Hpack() {
    }

    /* JADX INFO: renamed from: d */
    private final Map m29118d() {
        Header[] headerArr = f25802b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Header[] headerArr2 = f25802b;
            if (!linkedHashMap.containsKey(headerArr2[i7].f25798a)) {
                linkedHashMap.put(headerArr2[i7].f25798a, Integer.valueOf(i7));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC6118n.m27186d(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public final C0651h m29119a(C0651h name) throws IOException {
        AbstractC6118n.m27187e(name, "name");
        int iM3090F = name.m3090F();
        for (int i7 = 0; i7 < iM3090F; i7++) {
            byte bM3099k = name.m3099k(i7);
            if (65 <= bM3099k && bM3099k < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.m3094M());
            }
        }
        return name;
    }

    /* JADX INFO: renamed from: b */
    public final Map m29120b() {
        return f25803c;
    }

    /* JADX INFO: renamed from: c */
    public final Header[] m29121c() {
        return f25802b;
    }

    public static final class Reader {

        /* JADX INFO: renamed from: a */
        private final int f25804a;

        /* JADX INFO: renamed from: b */
        private int f25805b;

        /* JADX INFO: renamed from: c */
        private final List f25806c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC0650g f25807d;

        /* JADX INFO: renamed from: e */
        public Header[] f25808e;

        /* JADX INFO: renamed from: f */
        private int f25809f;

        /* JADX INFO: renamed from: g */
        public int f25810g;

        /* JADX INFO: renamed from: h */
        public int f25811h;

        public Reader(InterfaceC0640B source, int i7, int i8) {
            AbstractC6118n.m27187e(source, "source");
            this.f25804a = i7;
            this.f25805b = i8;
            this.f25806c = new ArrayList();
            this.f25807d = AbstractC0659p.m3132d(source);
            Header[] headerArr = new Header[8];
            this.f25808e = headerArr;
            this.f25809f = headerArr.length - 1;
        }

        /* JADX INFO: renamed from: a */
        private final void m29122a() {
            int i7 = this.f25805b;
            int i8 = this.f25811h;
            if (i7 < i8) {
                if (i7 == 0) {
                    m29123b();
                } else {
                    m29125d(i8 - i7);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private final void m29123b() {
            AbstractC1631j.m6701n(this.f25808e, null, 0, 0, 6, null);
            this.f25809f = this.f25808e.length - 1;
            this.f25810g = 0;
            this.f25811h = 0;
        }

        /* JADX INFO: renamed from: c */
        private final int m29124c(int i7) {
            return this.f25809f + 1 + i7;
        }

        /* JADX INFO: renamed from: d */
        private final int m29125d(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f25808e.length;
                while (true) {
                    length--;
                    i8 = this.f25809f;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    Header header = this.f25808e[length];
                    AbstractC6118n.m27184b(header);
                    int i10 = header.f25800c;
                    i7 -= i10;
                    this.f25811h -= i10;
                    this.f25810g--;
                    i9++;
                }
                Header[] headerArr = this.f25808e;
                System.arraycopy(headerArr, i8 + 1, headerArr, i8 + 1 + i9, this.f25810g);
                this.f25809f += i9;
            }
            return i9;
        }

        /* JADX INFO: renamed from: f */
        private final C0651h m29126f(int i7) throws IOException {
            if (m29128h(i7)) {
                return Hpack.f25801a.m29121c()[i7].f25798a;
            }
            int iM29124c = m29124c(i7 - Hpack.f25801a.m29121c().length);
            if (iM29124c >= 0) {
                Header[] headerArr = this.f25808e;
                if (iM29124c < headerArr.length) {
                    Header header = headerArr[iM29124c];
                    AbstractC6118n.m27184b(header);
                    return header.f25798a;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* JADX INFO: renamed from: g */
        private final void m29127g(int i7, Header header) {
            this.f25806c.add(header);
            int i8 = header.f25800c;
            if (i7 != -1) {
                Header header2 = this.f25808e[m29124c(i7)];
                AbstractC6118n.m27184b(header2);
                i8 -= header2.f25800c;
            }
            int i9 = this.f25805b;
            if (i8 > i9) {
                m29123b();
                return;
            }
            int iM29125d = m29125d((this.f25811h + i8) - i9);
            if (i7 == -1) {
                int i10 = this.f25810g + 1;
                Header[] headerArr = this.f25808e;
                if (i10 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f25809f = this.f25808e.length - 1;
                    this.f25808e = headerArr2;
                }
                int i11 = this.f25809f;
                this.f25809f = i11 - 1;
                this.f25808e[i11] = header;
                this.f25810g++;
            } else {
                this.f25808e[i7 + m29124c(i7) + iM29125d] = header;
            }
            this.f25811h += i8;
        }

        /* JADX INFO: renamed from: h */
        private final boolean m29128h(int i7) {
            return i7 >= 0 && i7 <= Hpack.f25801a.m29121c().length - 1;
        }

        /* JADX INFO: renamed from: i */
        private final int m29129i() {
            return Util.m28764d(this.f25807d.readByte(), 255);
        }

        /* JADX INFO: renamed from: l */
        private final void m29130l(int i7) throws IOException {
            if (m29128h(i7)) {
                this.f25806c.add(Hpack.f25801a.m29121c()[i7]);
                return;
            }
            int iM29124c = m29124c(i7 - Hpack.f25801a.m29121c().length);
            if (iM29124c >= 0) {
                Header[] headerArr = this.f25808e;
                if (iM29124c < headerArr.length) {
                    List list = this.f25806c;
                    Header header = headerArr[iM29124c];
                    AbstractC6118n.m27184b(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* JADX INFO: renamed from: n */
        private final void m29131n(int i7) {
            m29127g(-1, new Header(m29126f(i7), m29136j()));
        }

        /* JADX INFO: renamed from: o */
        private final void m29132o() {
            m29127g(-1, new Header(Hpack.f25801a.m29119a(m29136j()), m29136j()));
        }

        /* JADX INFO: renamed from: p */
        private final void m29133p(int i7) throws IOException {
            this.f25806c.add(new Header(m29126f(i7), m29136j()));
        }

        /* JADX INFO: renamed from: q */
        private final void m29134q() throws IOException {
            this.f25806c.add(new Header(Hpack.f25801a.m29119a(m29136j()), m29136j()));
        }

        /* JADX INFO: renamed from: e */
        public final List m29135e() {
            List listG0 = AbstractC1638q.m6593g0(this.f25806c);
            this.f25806c.clear();
            return listG0;
        }

        /* JADX INFO: renamed from: j */
        public final C0651h m29136j() {
            int iM29129i = m29129i();
            boolean z7 = (iM29129i & 128) == 128;
            long jM29138m = m29138m(iM29129i, 127);
            if (!z7) {
                return this.f25807d.mo3063r(jM29138m);
            }
            C0648e c0648e = new C0648e();
            Huffman.f25961a.m29316b(this.f25807d, jM29138m, c0648e);
            return c0648e.m3034a1();
        }

        /* JADX INFO: renamed from: k */
        public final void m29137k() throws IOException {
            while (!this.f25807d.mo3009E()) {
                int iM28764d = Util.m28764d(this.f25807d.readByte(), 255);
                if (iM28764d == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM28764d & 128) == 128) {
                    m29130l(m29138m(iM28764d, 127) - 1);
                } else if (iM28764d == 64) {
                    m29132o();
                } else if ((iM28764d & 64) == 64) {
                    m29131n(m29138m(iM28764d, 63) - 1);
                } else if ((iM28764d & 32) == 32) {
                    int iM29138m = m29138m(iM28764d, 31);
                    this.f25805b = iM29138m;
                    if (iM29138m < 0 || iM29138m > this.f25804a) {
                        throw new IOException("Invalid dynamic table size update " + this.f25805b);
                    }
                    m29122a();
                } else if (iM28764d == 16 || iM28764d == 0) {
                    m29134q();
                } else {
                    m29133p(m29138m(iM28764d, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final int m29138m(int i7, int i8) {
            int i9 = i7 & i8;
            if (i9 < i8) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int iM29129i = m29129i();
                if ((iM29129i & 128) == 0) {
                    return i8 + (iM29129i << i10);
                }
                i8 += (iM29129i & 127) << i10;
                i10 += 7;
            }
        }

        public /* synthetic */ Reader(InterfaceC0640B interfaceC0640B, int i7, int i8, int i9, AbstractC6112h abstractC6112h) {
            this(interfaceC0640B, i7, (i9 & 4) != 0 ? i7 : i8);
        }
    }

    public static final class Writer {

        /* JADX INFO: renamed from: a */
        public int f25812a;

        /* JADX INFO: renamed from: b */
        private final boolean f25813b;

        /* JADX INFO: renamed from: c */
        private final C0648e f25814c;

        /* JADX INFO: renamed from: d */
        private int f25815d;

        /* JADX INFO: renamed from: e */
        private boolean f25816e;

        /* JADX INFO: renamed from: f */
        public int f25817f;

        /* JADX INFO: renamed from: g */
        public Header[] f25818g;

        /* JADX INFO: renamed from: h */
        private int f25819h;

        /* JADX INFO: renamed from: i */
        public int f25820i;

        /* JADX INFO: renamed from: j */
        public int f25821j;

        public Writer(int i7, boolean z7, C0648e out) {
            AbstractC6118n.m27187e(out, "out");
            this.f25812a = i7;
            this.f25813b = z7;
            this.f25814c = out;
            this.f25815d = C3553a.e.API_PRIORITY_OTHER;
            this.f25817f = i7;
            Header[] headerArr = new Header[8];
            this.f25818g = headerArr;
            this.f25819h = headerArr.length - 1;
        }

        /* JADX INFO: renamed from: a */
        private final void m29139a() {
            int i7 = this.f25817f;
            int i8 = this.f25821j;
            if (i7 < i8) {
                if (i7 == 0) {
                    m29140b();
                } else {
                    m29141c(i8 - i7);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private final void m29140b() {
            AbstractC1631j.m6701n(this.f25818g, null, 0, 0, 6, null);
            this.f25819h = this.f25818g.length - 1;
            this.f25820i = 0;
            this.f25821j = 0;
        }

        /* JADX INFO: renamed from: c */
        private final int m29141c(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f25818g.length;
                while (true) {
                    length--;
                    i8 = this.f25819h;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    Header header = this.f25818g[length];
                    AbstractC6118n.m27184b(header);
                    i7 -= header.f25800c;
                    int i10 = this.f25821j;
                    Header header2 = this.f25818g[length];
                    AbstractC6118n.m27184b(header2);
                    this.f25821j = i10 - header2.f25800c;
                    this.f25820i--;
                    i9++;
                }
                Header[] headerArr = this.f25818g;
                System.arraycopy(headerArr, i8 + 1, headerArr, i8 + 1 + i9, this.f25820i);
                Header[] headerArr2 = this.f25818g;
                int i11 = this.f25819h;
                Arrays.fill(headerArr2, i11 + 1, i11 + 1 + i9, (Object) null);
                this.f25819h += i9;
            }
            return i9;
        }

        /* JADX INFO: renamed from: d */
        private final void m29142d(Header header) {
            int i7 = header.f25800c;
            int i8 = this.f25817f;
            if (i7 > i8) {
                m29140b();
                return;
            }
            m29141c((this.f25821j + i7) - i8);
            int i9 = this.f25820i + 1;
            Header[] headerArr = this.f25818g;
            if (i9 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f25819h = this.f25818g.length - 1;
                this.f25818g = headerArr2;
            }
            int i10 = this.f25819h;
            this.f25819h = i10 - 1;
            this.f25818g[i10] = header;
            this.f25820i++;
            this.f25821j += i7;
        }

        /* JADX INFO: renamed from: e */
        public final void m29143e(int i7) {
            this.f25812a = i7;
            int iMin = Math.min(i7, 16384);
            int i8 = this.f25817f;
            if (i8 == iMin) {
                return;
            }
            if (iMin < i8) {
                this.f25815d = Math.min(this.f25815d, iMin);
            }
            this.f25816e = true;
            this.f25817f = iMin;
            m29139a();
        }

        /* JADX INFO: renamed from: f */
        public final void m29144f(C0651h data) {
            AbstractC6118n.m27187e(data, "data");
            if (this.f25813b) {
                Huffman huffman = Huffman.f25961a;
                if (huffman.m29318d(data) < data.m3090F()) {
                    C0648e c0648e = new C0648e();
                    huffman.m29317c(data, c0648e);
                    C0651h c0651hM3034a1 = c0648e.m3034a1();
                    m29146h(c0651hM3034a1.m3090F(), 127, 128);
                    this.f25814c.mo3017N0(c0651hM3034a1);
                    return;
                }
            }
            m29146h(data.m3090F(), 127, 0);
            this.f25814c.mo3017N0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        /* JADX INFO: renamed from: g */
        public final void m29145g(List headerBlock) {
            int length;
            int length2;
            AbstractC6118n.m27187e(headerBlock, "headerBlock");
            if (this.f25816e) {
                int i7 = this.f25815d;
                if (i7 < this.f25817f) {
                    m29146h(i7, 31, 32);
                }
                this.f25816e = false;
                this.f25815d = C3553a.e.API_PRIORITY_OTHER;
                m29146h(this.f25817f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i8 = 0; i8 < size; i8++) {
                Header header = (Header) headerBlock.get(i8);
                C0651h c0651hMo3092J = header.f25798a.mo3092J();
                C0651h c0651h = header.f25799b;
                Hpack hpack = Hpack.f25801a;
                Integer num = (Integer) hpack.m29120b().get(c0651hMo3092J);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (AbstractC6118n.m27183a(hpack.m29121c()[iIntValue].f25799b, c0651h)) {
                        length = length2;
                    } else if (AbstractC6118n.m27183a(hpack.m29121c()[length2].f25799b, c0651h)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f25818g.length;
                    for (int i9 = this.f25819h + 1; i9 < length3; i9++) {
                        Header header2 = this.f25818g[i9];
                        AbstractC6118n.m27184b(header2);
                        if (AbstractC6118n.m27183a(header2.f25798a, c0651hMo3092J)) {
                            Header header3 = this.f25818g[i9];
                            AbstractC6118n.m27184b(header3);
                            if (AbstractC6118n.m27183a(header3.f25799b, c0651h)) {
                                length2 = Hpack.f25801a.m29121c().length + (i9 - this.f25819h);
                                break;
                            } else if (length == -1) {
                                length = (i9 - this.f25819h) + Hpack.f25801a.m29121c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m29146h(length2, 127, 128);
                } else if (length == -1) {
                    this.f25814c.mo3010F(64);
                    m29144f(c0651hMo3092J);
                    m29144f(c0651h);
                    m29142d(header);
                } else if (!c0651hMo3092J.m3091I(Header.f25792e) || AbstractC6118n.m27183a(Header.f25797j, c0651hMo3092J)) {
                    m29146h(length, 63, 64);
                    m29144f(c0651h);
                    m29142d(header);
                } else {
                    m29146h(length, 15, 0);
                    m29144f(c0651h);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m29146h(int i7, int i8, int i9) {
            if (i7 < i8) {
                this.f25814c.mo3010F(i7 | i9);
                return;
            }
            this.f25814c.mo3010F(i9 | i8);
            int i10 = i7 - i8;
            while (i10 >= 128) {
                this.f25814c.mo3010F(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.f25814c.mo3010F(i10);
        }

        public /* synthetic */ Writer(int i7, boolean z7, C0648e c0648e, int i8, AbstractC6112h abstractC6112h) {
            this((i8 & 1) != 0 ? 4096 : i7, (i8 & 2) != 0 ? true : z7, c0648e);
        }
    }
}
