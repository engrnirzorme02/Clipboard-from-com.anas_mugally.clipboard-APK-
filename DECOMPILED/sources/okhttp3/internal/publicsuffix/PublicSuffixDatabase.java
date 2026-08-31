package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p072I6.AbstractC0659p;
import p072I6.C0656m;
import p072I6.InterfaceC0650g;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;
import p294l6.AbstractC6307h;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final Companion f26039e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final byte[] f26040f = {42};

    /* JADX INFO: renamed from: g */
    private static final List f26041g = AbstractC1638q.m6759d("*");

    /* JADX INFO: renamed from: h */
    private static final PublicSuffixDatabase f26042h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f26043a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f26044b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    private byte[] f26045c;

    /* JADX INFO: renamed from: d */
    private byte[] f26046d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final String m29435b(byte[] bArr, byte[][] bArr2, int i7) {
            int i8;
            int iM28764d;
            boolean z7;
            int iM28764d2;
            int length = bArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = (i9 + length) / 2;
                while (i10 > -1 && bArr[i10] != 10) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i8 = i11 + i12;
                    if (bArr[i8] == 10) {
                        break;
                    }
                    i12++;
                }
                int i13 = i8 - i11;
                int i14 = i7;
                boolean z8 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z8) {
                        iM28764d = 46;
                        z7 = false;
                    } else {
                        boolean z9 = z8;
                        iM28764d = Util.m28764d(bArr2[i14][i15], 255);
                        z7 = z9;
                    }
                    iM28764d2 = iM28764d - Util.m28764d(bArr[i11 + i16], 255);
                    if (iM28764d2 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z8 = z7;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z8 = true;
                        i15 = -1;
                    }
                }
                if (iM28764d2 >= 0) {
                    if (iM28764d2 <= 0) {
                        int i17 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i18 = i14 + 1; i18 < length3; i18++) {
                            length2 += bArr2[i18].length;
                        }
                        if (length2 >= i17) {
                            if (length2 <= i17) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                AbstractC6118n.m27186d(UTF_8, "UTF_8");
                                return new String(bArr, i11, i13, UTF_8);
                            }
                        }
                    }
                    i9 = i8 + 1;
                }
                length = i10;
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final PublicSuffixDatabase m29436c() {
            return PublicSuffixDatabase.f26042h;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    private final List m29429b(List list) {
        String str;
        String strM29435b;
        String str2;
        List listJ;
        List listJ2;
        if (this.f26043a.get() || !this.f26043a.compareAndSet(false, true)) {
            try {
                this.f26044b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m29431e();
        }
        if (this.f26045c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i7 = 0; i7 < size; i7++) {
            String str3 = (String) list.get(i7);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC6118n.m27186d(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            AbstractC6118n.m27186d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i7] = bytes;
        }
        int i8 = 0;
        while (true) {
            str = null;
            if (i8 >= size) {
                strM29435b = null;
                break;
            }
            Companion companion = f26039e;
            byte[] bArr2 = this.f26045c;
            if (bArr2 == null) {
                AbstractC6118n.m27197o("publicSuffixListBytes");
                bArr2 = null;
            }
            strM29435b = companion.m29435b(bArr2, bArr, i8);
            if (strM29435b != null) {
                break;
            }
            i8++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str2 = null;
                break;
            }
            bArr3[i9] = f26040f;
            Companion companion2 = f26039e;
            byte[] bArr4 = this.f26045c;
            if (bArr4 == null) {
                AbstractC6118n.m27197o("publicSuffixListBytes");
                bArr4 = null;
            }
            String strM29435b2 = companion2.m29435b(bArr4, bArr3, i9);
            if (strM29435b2 != null) {
                str2 = strM29435b2;
                break;
            }
            i9++;
        }
        if (str2 != null) {
            int i10 = size - 1;
            for (int i11 = 0; i11 < i10; i11++) {
                Companion companion3 = f26039e;
                byte[] bArr5 = this.f26046d;
                if (bArr5 == null) {
                    AbstractC6118n.m27197o("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM29435b3 = companion3.m29435b(bArr5, bArr, i11);
                if (strM29435b3 != null) {
                    str = strM29435b3;
                    break;
                }
            }
        }
        if (str != null) {
            return AbstractC6406h.m27573F0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strM29435b == null && str2 == null) {
            return f26041g;
        }
        if (strM29435b == null || (listJ = AbstractC6406h.m27573F0(strM29435b, new char[]{'.'}, false, 0, 6, null)) == null) {
            listJ = AbstractC1638q.m6765j();
        }
        if (str2 == null || (listJ2 = AbstractC6406h.m27573F0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listJ2 = AbstractC1638q.m6765j();
        }
        return listJ.size() > listJ2.size() ? listJ : listJ2;
    }

    /* JADX INFO: renamed from: d */
    private final void m29430d() {
        try {
            C6099B c6099b = new C6099B();
            C6099B c6099b2 = new C6099B();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                InterfaceC0650g interfaceC0650gM3132d = AbstractC0659p.m3132d(new C0656m(AbstractC0659p.m3139k(resourceAsStream)));
                try {
                    c6099b.f23859a = interfaceC0650gM3132d.mo3066s0(interfaceC0650gM3132d.readInt());
                    c6099b2.f23859a = interfaceC0650gM3132d.mo3066s0(interfaceC0650gM3132d.readInt());
                    C1444v c1444v = C1444v.f4971a;
                    AbstractC3026b.m14999a(interfaceC0650gM3132d, null);
                    synchronized (this) {
                        Object obj = c6099b.f23859a;
                        AbstractC6118n.m27184b(obj);
                        this.f26045c = (byte[]) obj;
                        Object obj2 = c6099b2.f23859a;
                        AbstractC6118n.m27184b(obj2);
                        this.f26046d = (byte[]) obj2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3026b.m14999a(interfaceC0650gM3132d, th);
                        throw th2;
                    }
                }
            }
            this.f26044b.countDown();
        } catch (Throwable th3) {
            this.f26044b.countDown();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m29431e() {
        boolean z7 = false;
        while (true) {
            try {
                try {
                    m29430d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z7 = true;
                } catch (IOException e7) {
                    Platform.f26006a.m29391g().m29381k("Failed to read public suffix list", 5, e7);
                    if (!z7) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z7) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    /* JADX INFO: renamed from: f */
    private final List m29432f(String str) {
        List listF0 = AbstractC6406h.m27573F0(str, new char[]{'.'}, false, 0, 6, null);
        return AbstractC6118n.m27183a(AbstractC1638q.m6579S(listF0), "") ? AbstractC1638q.m6566F(listF0, 1) : listF0;
    }

    /* JADX INFO: renamed from: c */
    public final String m29433c(String domain) {
        int size;
        int size2;
        AbstractC6118n.m27187e(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        AbstractC6118n.m27186d(unicodeDomain, "unicodeDomain");
        List listM29432f = m29432f(unicodeDomain);
        List listM29429b = m29429b(listM29432f);
        if (listM29432f.size() == listM29429b.size() && ((String) listM29429b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM29429b.get(0)).charAt(0) == '!') {
            size = listM29432f.size();
            size2 = listM29429b.size();
        } else {
            size = listM29432f.size();
            size2 = listM29429b.size() + 1;
        }
        return AbstractC6307h.m27248m(AbstractC6307h.m27244i(AbstractC1638q.m6563C(m29432f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
