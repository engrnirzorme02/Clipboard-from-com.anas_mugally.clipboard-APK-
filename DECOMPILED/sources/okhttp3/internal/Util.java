package okhttp3.internal;

import com.google.android.gms.common.api.C3553a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6107c;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6103F;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.p319io.FileSystem;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.C0662s;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p145S5.AbstractC1423a;
import p145S5.C1444v;
import p152T5.AbstractC1608F;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;
import p278j6.AbstractC5905g;
import p278j6.C5904f;
import p302m6.AbstractC6406h;
import p302m6.C6402d;
import p302m6.C6405g;

/* JADX INFO: loaded from: classes.dex */
public final class Util {

    /* JADX INFO: renamed from: a */
    public static final byte[] f25477a;

    /* JADX INFO: renamed from: b */
    public static final Headers f25478b = Headers.f25275b.m28496g(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final ResponseBody f25479c;

    /* JADX INFO: renamed from: d */
    public static final RequestBody f25480d;

    /* JADX INFO: renamed from: e */
    private static final C0662s f25481e;

    /* JADX INFO: renamed from: f */
    public static final TimeZone f25482f;

    /* JADX INFO: renamed from: g */
    private static final C6405g f25483g;

    /* JADX INFO: renamed from: h */
    public static final boolean f25484h;

    /* JADX INFO: renamed from: i */
    public static final String f25485i;

    static {
        byte[] bArr = new byte[0];
        f25477a = bArr;
        f25479c = ResponseBody.Companion.m28711c(ResponseBody.f25458a, bArr, null, 1, null);
        f25480d = RequestBody.Companion.m28668c(RequestBody.f25422a, bArr, null, 0, 0, 7, null);
        C0662s.a aVar = C0662s.f2585d;
        C0651h.a aVar2 = C0651h.f2562d;
        f25481e = aVar.m3164d(aVar2.m3112b("efbbbf"), aVar2.m3112b("feff"), aVar2.m3112b("fffe"), aVar2.m3112b("0000ffff"), aVar2.m3112b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC6118n.m27184b(timeZone);
        f25482f = timeZone;
        f25483g = new C6405g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f25484h = false;
        String name = OkHttpClient.class.getName();
        AbstractC6118n.m27186d(name, "OkHttpClient::class.java.name");
        f25485i = AbstractC6406h.m27625x0(AbstractC6406h.m27624w0(name, "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m28732A(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return m28786z(str, i7, i8);
    }

    /* JADX INFO: renamed from: B */
    public static final int m28733B(String str, int i7, int i8) {
        AbstractC6118n.m27187e(str, "<this>");
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i9 + 1;
                }
                if (i9 != i7) {
                    i9--;
                }
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m28734C(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return m28733B(str, i7, i8);
    }

    /* JADX INFO: renamed from: D */
    public static final int m28735D(String str, int i7) {
        AbstractC6118n.m27187e(str, "<this>");
        int length = str.length();
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: E */
    public static final String[] m28736E(String[] strArr, String[] other, Comparator comparator) {
        AbstractC6118n.m27187e(strArr, "<this>");
        AbstractC6118n.m27187e(other, "other");
        AbstractC6118n.m27187e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m28737F(FileSystem fileSystem, File file) throws IOException {
        AbstractC6118n.m27187e(fileSystem, "<this>");
        AbstractC6118n.m27187e(file, "file");
        InterfaceC0669z interfaceC0669zMo29336b = fileSystem.mo29336b(file);
        try {
            try {
                fileSystem.mo29340f(file);
                AbstractC3026b.m14999a(interfaceC0669zMo29336b, null);
                return true;
            } catch (IOException unused) {
                C1444v c1444v = C1444v.f4971a;
                AbstractC3026b.m14999a(interfaceC0669zMo29336b, null);
                fileSystem.mo29340f(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(interfaceC0669zMo29336b, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m28738G(Socket socket, InterfaceC0650g source) {
        AbstractC6118n.m27187e(socket, "<this>");
        AbstractC6118n.m27187e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.mo3009E();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m28739H(String name) {
        AbstractC6118n.m27187e(name, "name");
        return AbstractC6406h.m27564w(name, "Authorization", true) || AbstractC6406h.m27564w(name, "Cookie", true) || AbstractC6406h.m27564w(name, "Proxy-Authorization", true) || AbstractC6406h.m27564w(name, "Set-Cookie", true);
    }

    /* JADX INFO: renamed from: I */
    public static final int m28740I(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' > c7 || c7 >= 'G') {
            return -1;
        }
        return c7 - '7';
    }

    /* JADX INFO: renamed from: J */
    public static final Charset m28741J(InterfaceC0650g interfaceC0650g, Charset charset) {
        AbstractC6118n.m27187e(interfaceC0650g, "<this>");
        AbstractC6118n.m27187e(charset, "default");
        int iMo3064r0 = interfaceC0650g.mo3064r0(f25481e);
        if (iMo3064r0 == -1) {
            return charset;
        }
        if (iMo3064r0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC6118n.m27186d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iMo3064r0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC6118n.m27186d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iMo3064r0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC6118n.m27186d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iMo3064r0 == 3) {
            return C6402d.f24427a.m27520a();
        }
        if (iMo3064r0 == 4) {
            return C6402d.f24427a.m27521b();
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: K */
    public static final int m28742K(InterfaceC0650g interfaceC0650g) {
        AbstractC6118n.m27187e(interfaceC0650g, "<this>");
        return m28764d(interfaceC0650g.readByte(), 255) | (m28764d(interfaceC0650g.readByte(), 255) << 16) | (m28764d(interfaceC0650g.readByte(), 255) << 8);
    }

    /* JADX INFO: renamed from: L */
    public static final int m28743L(C0648e c0648e, byte b7) throws EOFException {
        AbstractC6118n.m27187e(c0648e, "<this>");
        int i7 = 0;
        while (!c0648e.mo3009E() && c0648e.m3060p0(0L) == b7) {
            i7++;
            c0648e.readByte();
        }
        return i7;
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m28744M(InterfaceC0640B interfaceC0640B, int i7, TimeUnit timeUnit) {
        AbstractC6118n.m27187e(interfaceC0640B, "<this>");
        AbstractC6118n.m27187e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo2952c = interfaceC0640B.mo2948g().mo2954e() ? interfaceC0640B.mo2948g().mo2952c() - jNanoTime : Long.MAX_VALUE;
        interfaceC0640B.mo2948g().mo2953d(Math.min(jMo2952c, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            C0648e c0648e = new C0648e();
            while (interfaceC0640B.mo2949w(c0648e, 8192L) != -1) {
                c0648e.m3076x();
            }
            if (jMo2952c == Long.MAX_VALUE) {
                interfaceC0640B.mo2948g().mo2950a();
                return true;
            }
            interfaceC0640B.mo2948g().mo2953d(jNanoTime + jMo2952c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo2952c == Long.MAX_VALUE) {
                interfaceC0640B.mo2948g().mo2950a();
                return false;
            }
            interfaceC0640B.mo2948g().mo2953d(jNanoTime + jMo2952c);
            return false;
        } catch (Throwable th) {
            if (jMo2952c == Long.MAX_VALUE) {
                interfaceC0640B.mo2948g().mo2950a();
            } else {
                interfaceC0640B.mo2948g().mo2953d(jNanoTime + jMo2952c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: N */
    public static final ThreadFactory m28745N(final String name, final boolean z7) {
        AbstractC6118n.m27187e(name, "name");
        return new ThreadFactory() { // from class: H6.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.m28746O(name, z7, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Thread m28746O(String name, boolean z7, Runnable runnable) {
        AbstractC6118n.m27187e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z7);
        return thread;
    }

    /* JADX INFO: renamed from: P */
    public static final List m28747P(Headers headers) {
        AbstractC6118n.m27187e(headers, "<this>");
        C5904f c5904fK = AbstractC5905g.m26663k(0, headers.size());
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(c5904fK, 10));
        Iterator it = c5904fK.iterator();
        while (it.hasNext()) {
            int iMo6617a = ((AbstractC1608F) it).mo6617a();
            arrayList.add(new Header(headers.m28478b(iMo6617a), headers.m28480g(iMo6617a)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public static final Headers m28748Q(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.m28484c(header.m29116a().m3094M(), header.m29117b().m3094M());
        }
        return builder.m28485d();
    }

    /* JADX INFO: renamed from: R */
    public static final String m28749R(int i7) {
        String hexString = Integer.toHexString(i7);
        AbstractC6118n.m27186d(hexString, "toHexString(this)");
        return hexString;
    }

    /* JADX INFO: renamed from: S */
    public static final String m28750S(long j7) {
        String hexString = Long.toHexString(j7);
        AbstractC6118n.m27186d(hexString, "toHexString(this)");
        return hexString;
    }

    /* JADX INFO: renamed from: T */
    public static final String m28751T(HttpUrl httpUrl, boolean z7) {
        String strM28504h;
        AbstractC6118n.m27187e(httpUrl, "<this>");
        if (AbstractC6406h.m27589Q(httpUrl.m28504h(), ":", false, 2, null)) {
            strM28504h = '[' + httpUrl.m28504h() + ']';
        } else {
            strM28504h = httpUrl.m28504h();
        }
        if (!z7 && httpUrl.m28508l() == HttpUrl.f25278k.m28551c(httpUrl.m28512p())) {
            return strM28504h;
        }
        return strM28504h + ':' + httpUrl.m28508l();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ String m28752U(HttpUrl httpUrl, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return m28751T(httpUrl, z7);
    }

    /* JADX INFO: renamed from: V */
    public static final List m28753V(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1638q.m6596j0(list));
        AbstractC6118n.m27186d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: W */
    public static final Map m28754W(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC1610H.m6626h();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        AbstractC6118n.m27186d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: X */
    public static final long m28755X(String str, long j7) {
        AbstractC6118n.m27187e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j7;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final int m28756Y(String str, int i7) {
        if (str != null) {
            try {
                long j7 = Long.parseLong(str);
                if (j7 > 2147483647L) {
                    return C3553a.e.API_PRIORITY_OTHER;
                }
                if (j7 < 0) {
                    return 0;
                }
                return (int) j7;
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: Z */
    public static final String m28757Z(String str, int i7, int i8) {
        AbstractC6118n.m27187e(str, "<this>");
        int iM28786z = m28786z(str, i7, i8);
        String strSubstring = str.substring(iM28786z, m28733B(str, iM28786z, i8));
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ String m28759a0(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return m28757Z(str, i7, i8);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Throwable m28761b0(Exception exc, List suppressed) {
        AbstractC6118n.m27187e(exc, "<this>");
        AbstractC6118n.m27187e(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC1423a.m6060a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* JADX INFO: renamed from: c */
    public static final void m28762c(List list, Object obj) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m28763c0(InterfaceC0649f interfaceC0649f, int i7) {
        AbstractC6118n.m27187e(interfaceC0649f, "<this>");
        interfaceC0649f.mo3010F((i7 >>> 16) & 255);
        interfaceC0649f.mo3010F((i7 >>> 8) & 255);
        interfaceC0649f.mo3010F(i7 & 255);
    }

    /* JADX INFO: renamed from: d */
    public static final int m28764d(byte b7, int i7) {
        return b7 & i7;
    }

    /* JADX INFO: renamed from: e */
    public static final int m28765e(short s7, int i7) {
        return s7 & i7;
    }

    /* JADX INFO: renamed from: f */
    public static final long m28766f(int i7, long j7) {
        return ((long) i7) & j7;
    }

    /* JADX INFO: renamed from: g */
    public static final EventListener.Factory m28767g(final EventListener eventListener) {
        AbstractC6118n.m27187e(eventListener, "<this>");
        return new EventListener.Factory() { // from class: H6.a
            @Override // okhttp3.EventListener.Factory
            /* JADX INFO: renamed from: a */
            public final EventListener mo2539a(Call call) {
                return Util.m28768h(eventListener, call);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final EventListener m28768h(EventListener this_asFactory, Call it) {
        AbstractC6118n.m27187e(this_asFactory, "$this_asFactory");
        AbstractC6118n.m27187e(it, "it");
        return this_asFactory;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m28769i(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        return f25483g.m27529a(str);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m28770j(HttpUrl httpUrl, HttpUrl other) {
        AbstractC6118n.m27187e(httpUrl, "<this>");
        AbstractC6118n.m27187e(other, "other");
        return AbstractC6118n.m27183a(httpUrl.m28504h(), other.m28504h()) && httpUrl.m28508l() == other.m28508l() && AbstractC6118n.m27183a(httpUrl.m28512p(), other.m28512p());
    }

    /* JADX INFO: renamed from: k */
    public static final int m28771k(String name, long j7, TimeUnit timeUnit) {
        AbstractC6118n.m27187e(name, "name");
        if (j7 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j7);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j7 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    /* JADX INFO: renamed from: l */
    public static final void m28772l(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m28773m(Closeable closeable) {
        AbstractC6118n.m27187e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m28774n(Socket socket) {
        AbstractC6118n.m27187e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!AbstractC6118n.m27183a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static final String[] m28775o(String[] strArr, String value) {
        AbstractC6118n.m27187e(strArr, "<this>");
        AbstractC6118n.m27187e(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC1631j.m6749v(strArr2)] = value;
        return strArr2;
    }

    /* JADX INFO: renamed from: p */
    public static final int m28776p(String str, char c7, int i7, int i8) {
        AbstractC6118n.m27187e(str, "<this>");
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* JADX INFO: renamed from: q */
    public static final int m28777q(String str, String delimiters, int i7, int i8) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(delimiters, "delimiters");
        while (i7 < i8) {
            if (AbstractC6406h.m27587P(delimiters, str.charAt(i7), false, 2, null)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m28778r(String str, char c7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return m28776p(str, c7, i7, i8);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m28779s(InterfaceC0640B interfaceC0640B, int i7, TimeUnit timeUnit) {
        AbstractC6118n.m27187e(interfaceC0640B, "<this>");
        AbstractC6118n.m27187e(timeUnit, "timeUnit");
        try {
            return m28744M(interfaceC0640B, i7, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final String m28780t(String format, Object... args) {
        AbstractC6118n.m27187e(format, "format");
        AbstractC6118n.m27187e(args, "args");
        C6103F c6103f = C6103F.f23863a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC6118n.m27186d(str, "format(locale, format, *args)");
        return str;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m28781u(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC6118n.m27187e(strArr, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itM27171a = AbstractC6107c.m27171a(strArr2);
                while (itM27171a.hasNext()) {
                    if (comparator.compare(str, (String) itM27171a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static final long m28782v(Response response) {
        AbstractC6118n.m27187e(response, "<this>");
        String strM28477a = response.m28686o0().m28477a("Content-Length");
        if (strM28477a != null) {
            return m28755X(strM28477a, -1L);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: w */
    public static final List m28783w(Object... elements) {
        AbstractC6118n.m27187e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1638q.m6767l(Arrays.copyOf(objArr, objArr.length)));
        AbstractC6118n.m27186d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: x */
    public static final int m28784x(String[] strArr, String value, Comparator comparator) {
        AbstractC6118n.m27187e(strArr, "<this>");
        AbstractC6118n.m27187e(value, "value");
        AbstractC6118n.m27187e(comparator, "comparator");
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (comparator.compare(strArr[i7], value) == 0) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static final int m28785y(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (AbstractC6118n.m27188f(cCharAt, 31) <= 0 || AbstractC6118n.m27188f(cCharAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public static final int m28786z(String str, int i7, int i8) {
        AbstractC6118n.m27187e(str, "<this>");
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }
}
