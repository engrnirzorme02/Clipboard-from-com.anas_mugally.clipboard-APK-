package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.profileinstaller.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2734g {

    /* JADX INFO: renamed from: a */
    static final byte[] f10689a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    static final byte[] f10690b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: A */
    private static void m12899A(byte[] bArr, int i7, int i8, C2730c c2730c) {
        int iM12928m = m12928m(i7, i8, c2730c.f10677g);
        int i9 = iM12928m / 8;
        bArr[i9] = (byte) ((1 << (iM12928m % 8)) | bArr[i9]);
    }

    /* JADX INFO: renamed from: B */
    private static void m12900B(InputStream inputStream) {
        AbstractC2731d.m12875h(inputStream);
        int iM12877j = AbstractC2731d.m12877j(inputStream);
        if (iM12877j == 6 || iM12877j == 7) {
            return;
        }
        while (iM12877j > 0) {
            AbstractC2731d.m12877j(inputStream);
            for (int iM12877j2 = AbstractC2731d.m12877j(inputStream); iM12877j2 > 0; iM12877j2--) {
                AbstractC2731d.m12875h(inputStream);
            }
            iM12877j--;
        }
    }

    /* JADX INFO: renamed from: C */
    static boolean m12901C(OutputStream outputStream, byte[] bArr, C2730c[] c2730cArr) throws IOException {
        if (Arrays.equals(bArr, AbstractC2736i.f10702a)) {
            m12914P(outputStream, c2730cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2736i.f10703b)) {
            m12913O(outputStream, c2730cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2736i.f10705d)) {
            m12911M(outputStream, c2730cArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2736i.f10704c)) {
            m12912N(outputStream, c2730cArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC2736i.f10706e)) {
            return false;
        }
        m12910L(outputStream, c2730cArr);
        return true;
    }

    /* JADX INFO: renamed from: D */
    private static void m12902D(OutputStream outputStream, C2730c c2730c) throws IOException {
        int[] iArr = c2730c.f10678h;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            AbstractC2731d.m12883p(outputStream, i9 - i8);
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: E */
    private static C2737j m12903E(C2730c[] c2730cArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC2731d.m12883p(byteArrayOutputStream, c2730cArr.length);
            int i7 = 2;
            for (C2730c c2730c : c2730cArr) {
                AbstractC2731d.m12884q(byteArrayOutputStream, c2730c.f10673c);
                AbstractC2731d.m12884q(byteArrayOutputStream, c2730c.f10674d);
                AbstractC2731d.m12884q(byteArrayOutputStream, c2730c.f10677g);
                String strM12925j = m12925j(c2730c.f10671a, c2730c.f10672b, AbstractC2736i.f10702a);
                int iM12878k = AbstractC2731d.m12878k(strM12925j);
                AbstractC2731d.m12883p(byteArrayOutputStream, iM12878k);
                i7 = i7 + 14 + iM12878k;
                AbstractC2731d.m12881n(byteArrayOutputStream, strM12925j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i7 == byteArray.length) {
                C2737j c2737j = new C2737j(EnumC2732e.DEX_FILES, i7, byteArray, false);
                byteArrayOutputStream.close();
                return c2737j;
            }
            throw AbstractC2731d.m12870c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    static void m12904F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f10689a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: G */
    private static void m12905G(OutputStream outputStream, C2730c c2730c) throws IOException {
        m12909K(outputStream, c2730c);
        m12902D(outputStream, c2730c);
        m12907I(outputStream, c2730c);
    }

    /* JADX INFO: renamed from: H */
    private static void m12906H(OutputStream outputStream, C2730c c2730c, String str) throws IOException {
        AbstractC2731d.m12883p(outputStream, AbstractC2731d.m12878k(str));
        AbstractC2731d.m12883p(outputStream, c2730c.f10675e);
        AbstractC2731d.m12884q(outputStream, c2730c.f10676f);
        AbstractC2731d.m12884q(outputStream, c2730c.f10673c);
        AbstractC2731d.m12884q(outputStream, c2730c.f10677g);
        AbstractC2731d.m12881n(outputStream, str);
    }

    /* JADX INFO: renamed from: I */
    private static void m12907I(OutputStream outputStream, C2730c c2730c) throws IOException {
        byte[] bArr = new byte[m12926k(c2730c.f10677g)];
        for (Map.Entry entry : c2730c.f10679i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                m12899A(bArr, 2, iIntValue, c2730c);
            }
            if ((iIntValue2 & 4) != 0) {
                m12899A(bArr, 4, iIntValue, c2730c);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: J */
    private static void m12908J(OutputStream outputStream, int i7, C2730c c2730c) throws IOException {
        byte[] bArr = new byte[m12927l(i7, c2730c.f10677g)];
        for (Map.Entry entry : c2730c.f10679i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i8 = 0;
            for (int i9 = 1; i9 <= 4; i9 <<= 1) {
                if (i9 != 1 && (i9 & i7) != 0) {
                    if ((i9 & iIntValue2) == i9) {
                        int i10 = (c2730c.f10677g * i8) + iIntValue;
                        int i11 = i10 / 8;
                        bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
                    }
                    i8++;
                }
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: K */
    private static void m12909K(OutputStream outputStream, C2730c c2730c) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : c2730c.f10679i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC2731d.m12883p(outputStream, iIntValue - i7);
                AbstractC2731d.m12883p(outputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private static void m12910L(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        AbstractC2731d.m12883p(outputStream, c2730cArr.length);
        for (C2730c c2730c : c2730cArr) {
            String strM12925j = m12925j(c2730c.f10671a, c2730c.f10672b, AbstractC2736i.f10706e);
            AbstractC2731d.m12883p(outputStream, AbstractC2731d.m12878k(strM12925j));
            AbstractC2731d.m12883p(outputStream, c2730c.f10679i.size());
            AbstractC2731d.m12883p(outputStream, c2730c.f10678h.length);
            AbstractC2731d.m12884q(outputStream, c2730c.f10673c);
            AbstractC2731d.m12881n(outputStream, strM12925j);
            Iterator it = c2730c.f10679i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC2731d.m12883p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i7 : c2730c.f10678h) {
                AbstractC2731d.m12883p(outputStream, i7);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private static void m12911M(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        AbstractC2731d.m12885r(outputStream, c2730cArr.length);
        for (C2730c c2730c : c2730cArr) {
            int size = c2730c.f10679i.size() * 4;
            String strM12925j = m12925j(c2730c.f10671a, c2730c.f10672b, AbstractC2736i.f10705d);
            AbstractC2731d.m12883p(outputStream, AbstractC2731d.m12878k(strM12925j));
            AbstractC2731d.m12883p(outputStream, c2730c.f10678h.length);
            AbstractC2731d.m12884q(outputStream, size);
            AbstractC2731d.m12884q(outputStream, c2730c.f10673c);
            AbstractC2731d.m12881n(outputStream, strM12925j);
            Iterator it = c2730c.f10679i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC2731d.m12883p(outputStream, ((Integer) it.next()).intValue());
                AbstractC2731d.m12883p(outputStream, 0);
            }
            for (int i7 : c2730c.f10678h) {
                AbstractC2731d.m12883p(outputStream, i7);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private static void m12912N(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        byte[] bArrM12917b = m12917b(c2730cArr, AbstractC2736i.f10704c);
        AbstractC2731d.m12885r(outputStream, c2730cArr.length);
        AbstractC2731d.m12880m(outputStream, bArrM12917b);
    }

    /* JADX INFO: renamed from: O */
    private static void m12913O(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        byte[] bArrM12917b = m12917b(c2730cArr, AbstractC2736i.f10703b);
        AbstractC2731d.m12885r(outputStream, c2730cArr.length);
        AbstractC2731d.m12880m(outputStream, bArrM12917b);
    }

    /* JADX INFO: renamed from: P */
    private static void m12914P(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        m12915Q(outputStream, c2730cArr);
    }

    /* JADX INFO: renamed from: Q */
    private static void m12915Q(OutputStream outputStream, C2730c[] c2730cArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m12903E(c2730cArr));
        arrayList.add(m12918c(c2730cArr));
        arrayList.add(m12919d(c2730cArr));
        long length2 = ((long) AbstractC2736i.f10702a.length) + ((long) f10689a.length) + 4 + ((long) (arrayList.size() * 16));
        AbstractC2731d.m12884q(outputStream, arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C2737j c2737j = (C2737j) arrayList.get(i7);
            AbstractC2731d.m12884q(outputStream, c2737j.f10709a.m12887d());
            AbstractC2731d.m12884q(outputStream, length2);
            if (c2737j.f10712d) {
                byte[] bArr = c2737j.f10711c;
                long length3 = bArr.length;
                byte[] bArrM12869b = AbstractC2731d.m12869b(bArr);
                arrayList2.add(bArrM12869b);
                AbstractC2731d.m12884q(outputStream, bArrM12869b.length);
                AbstractC2731d.m12884q(outputStream, length3);
                length = bArrM12869b.length;
            } else {
                arrayList2.add(c2737j.f10711c);
                AbstractC2731d.m12884q(outputStream, c2737j.f10711c.length);
                AbstractC2731d.m12884q(outputStream, 0L);
                length = c2737j.f10711c.length;
            }
            length2 += (long) length;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            outputStream.write((byte[]) arrayList2.get(i8));
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m12916a(C2730c c2730c) {
        Iterator it = c2730c.f10679i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m12917b(C2730c[] c2730cArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int iM12878k = 0;
        for (C2730c c2730c : c2730cArr) {
            iM12878k += AbstractC2731d.m12878k(m12925j(c2730c.f10671a, c2730c.f10672b, bArr)) + 16 + (c2730c.f10675e * 2) + c2730c.f10676f + m12926k(c2730c.f10677g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM12878k);
        if (Arrays.equals(bArr, AbstractC2736i.f10704c)) {
            int length = c2730cArr.length;
            while (i7 < length) {
                C2730c c2730c2 = c2730cArr[i7];
                m12906H(byteArrayOutputStream, c2730c2, m12925j(c2730c2.f10671a, c2730c2.f10672b, bArr));
                m12905G(byteArrayOutputStream, c2730c2);
                i7++;
            }
        } else {
            for (C2730c c2730c3 : c2730cArr) {
                m12906H(byteArrayOutputStream, c2730c3, m12925j(c2730c3.f10671a, c2730c3.f10672b, bArr));
            }
            int length2 = c2730cArr.length;
            while (i7 < length2) {
                m12905G(byteArrayOutputStream, c2730cArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == iM12878k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC2731d.m12870c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM12878k);
    }

    /* JADX INFO: renamed from: c */
    private static C2737j m12918c(C2730c[] c2730cArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < c2730cArr.length; i8++) {
            try {
                C2730c c2730c = c2730cArr[i8];
                AbstractC2731d.m12883p(byteArrayOutputStream, i8);
                AbstractC2731d.m12883p(byteArrayOutputStream, c2730c.f10675e);
                i7 = i7 + 4 + (c2730c.f10675e * 2);
                m12902D(byteArrayOutputStream, c2730c);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            C2737j c2737j = new C2737j(EnumC2732e.CLASSES, i7, byteArray, true);
            byteArrayOutputStream.close();
            return c2737j;
        }
        throw AbstractC2731d.m12870c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    private static C2737j m12919d(C2730c[] c2730cArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < c2730cArr.length; i8++) {
            try {
                C2730c c2730c = c2730cArr[i8];
                int iM12916a = m12916a(c2730c);
                byte[] bArrM12920e = m12920e(iM12916a, c2730c);
                byte[] bArrM12921f = m12921f(c2730c);
                AbstractC2731d.m12883p(byteArrayOutputStream, i8);
                int length = bArrM12920e.length + 2 + bArrM12921f.length;
                AbstractC2731d.m12884q(byteArrayOutputStream, length);
                AbstractC2731d.m12883p(byteArrayOutputStream, iM12916a);
                byteArrayOutputStream.write(bArrM12920e);
                byteArrayOutputStream.write(bArrM12921f);
                i7 = i7 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            C2737j c2737j = new C2737j(EnumC2732e.METHODS, i7, byteArray, true);
            byteArrayOutputStream.close();
            return c2737j;
        }
        throw AbstractC2731d.m12870c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m12920e(int i7, C2730c c2730c) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m12908J(byteArrayOutputStream, i7, c2730c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m12921f(C2730c c2730c) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m12909K(byteArrayOutputStream, c2730c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m12922g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* JADX INFO: renamed from: h */
    private static String m12923h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: i */
    private static C2730c m12924i(C2730c[] c2730cArr, String str) {
        if (c2730cArr.length <= 0) {
            return null;
        }
        String strM12923h = m12923h(str);
        for (int i7 = 0; i7 < c2730cArr.length; i7++) {
            if (c2730cArr[i7].f10672b.equals(strM12923h)) {
                return c2730cArr[i7];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private static String m12925j(String str, String str2, byte[] bArr) {
        String strM12948a = AbstractC2736i.m12948a(bArr);
        if (str.length() <= 0) {
            return m12922g(str2, strM12948a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m12922g(str2, strM12948a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC2736i.m12948a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    private static int m12926k(int i7) {
        return m12941z(i7 * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    private static int m12927l(int i7, int i8) {
        return m12941z(Integer.bitCount(i7 & (-2)) * i8) / 8;
    }

    /* JADX INFO: renamed from: m */
    private static int m12928m(int i7, int i8, int i9) {
        if (i7 == 1) {
            throw AbstractC2731d.m12870c("HOT methods are not stored in the bitmap");
        }
        if (i7 == 2) {
            return i8;
        }
        if (i7 == 4) {
            return i8 + i9;
        }
        throw AbstractC2731d.m12870c("Unexpected flag: " + i7);
    }

    /* JADX INFO: renamed from: n */
    private static int[] m12929n(InputStream inputStream, int i7) {
        int[] iArr = new int[i7];
        int iM12875h = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iM12875h += AbstractC2731d.m12875h(inputStream);
            iArr[i8] = iM12875h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    private static int m12930o(BitSet bitSet, int i7, int i8) {
        int i9 = bitSet.get(m12928m(2, i7, i8)) ? 2 : 0;
        return bitSet.get(m12928m(4, i7, i8)) ? i9 | 4 : i9;
    }

    /* JADX INFO: renamed from: p */
    static byte[] m12931p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC2731d.m12871d(inputStream, bArr.length))) {
            return AbstractC2731d.m12871d(inputStream, AbstractC2736i.f10703b.length);
        }
        throw AbstractC2731d.m12870c("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    private static void m12932q(InputStream inputStream, C2730c c2730c) {
        int iAvailable = inputStream.available() - c2730c.f10676f;
        int iM12875h = 0;
        while (inputStream.available() > iAvailable) {
            iM12875h += AbstractC2731d.m12875h(inputStream);
            c2730c.f10679i.put(Integer.valueOf(iM12875h), 1);
            for (int iM12875h2 = AbstractC2731d.m12875h(inputStream); iM12875h2 > 0; iM12875h2--) {
                m12900B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw AbstractC2731d.m12870c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: renamed from: r */
    static C2730c[] m12933r(InputStream inputStream, byte[] bArr, byte[] bArr2, C2730c[] c2730cArr) {
        if (Arrays.equals(bArr, AbstractC2736i.f10707f)) {
            if (Arrays.equals(AbstractC2736i.f10702a, bArr2)) {
                throw AbstractC2731d.m12870c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m12934s(inputStream, bArr, c2730cArr);
        }
        if (Arrays.equals(bArr, AbstractC2736i.f10708g)) {
            return m12936u(inputStream, bArr2, c2730cArr);
        }
        throw AbstractC2731d.m12870c("Unsupported meta version");
    }

    /* JADX INFO: renamed from: s */
    static C2730c[] m12934s(InputStream inputStream, byte[] bArr, C2730c[] c2730cArr) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2736i.f10707f)) {
            throw AbstractC2731d.m12870c("Unsupported meta version");
        }
        int iM12877j = AbstractC2731d.m12877j(inputStream);
        byte[] bArrM12872e = AbstractC2731d.m12872e(inputStream, (int) AbstractC2731d.m12876i(inputStream), (int) AbstractC2731d.m12876i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2731d.m12870c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM12872e);
        try {
            C2730c[] c2730cArrM12935t = m12935t(byteArrayInputStream, iM12877j, c2730cArr);
            byteArrayInputStream.close();
            return c2730cArrM12935t;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    private static C2730c[] m12935t(InputStream inputStream, int i7, C2730c[] c2730cArr) {
        if (inputStream.available() == 0) {
            return new C2730c[0];
        }
        if (i7 != c2730cArr.length) {
            throw AbstractC2731d.m12870c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM12875h = AbstractC2731d.m12875h(inputStream);
            iArr[i8] = AbstractC2731d.m12875h(inputStream);
            strArr[i8] = AbstractC2731d.m12873f(inputStream, iM12875h);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C2730c c2730c = c2730cArr[i9];
            if (!c2730c.f10672b.equals(strArr[i9])) {
                throw AbstractC2731d.m12870c("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            c2730c.f10675e = i10;
            c2730c.f10678h = m12929n(inputStream, i10);
        }
        return c2730cArr;
    }

    /* JADX INFO: renamed from: u */
    static C2730c[] m12936u(InputStream inputStream, byte[] bArr, C2730c[] c2730cArr) throws IOException {
        int iM12875h = AbstractC2731d.m12875h(inputStream);
        byte[] bArrM12872e = AbstractC2731d.m12872e(inputStream, (int) AbstractC2731d.m12876i(inputStream), (int) AbstractC2731d.m12876i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2731d.m12870c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM12872e);
        try {
            C2730c[] c2730cArrM12937v = m12937v(byteArrayInputStream, bArr, iM12875h, c2730cArr);
            byteArrayInputStream.close();
            return c2730cArrM12937v;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    private static C2730c[] m12937v(InputStream inputStream, byte[] bArr, int i7, C2730c[] c2730cArr) {
        if (inputStream.available() == 0) {
            return new C2730c[0];
        }
        if (i7 != c2730cArr.length) {
            throw AbstractC2731d.m12870c("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            AbstractC2731d.m12875h(inputStream);
            String strM12873f = AbstractC2731d.m12873f(inputStream, AbstractC2731d.m12875h(inputStream));
            long jM12876i = AbstractC2731d.m12876i(inputStream);
            int iM12875h = AbstractC2731d.m12875h(inputStream);
            C2730c c2730cM12924i = m12924i(c2730cArr, strM12873f);
            if (c2730cM12924i == null) {
                throw AbstractC2731d.m12870c("Missing profile key: " + strM12873f);
            }
            c2730cM12924i.f10674d = jM12876i;
            int[] iArrM12929n = m12929n(inputStream, iM12875h);
            if (Arrays.equals(bArr, AbstractC2736i.f10706e)) {
                c2730cM12924i.f10675e = iM12875h;
                c2730cM12924i.f10678h = iArrM12929n;
            }
        }
        return c2730cArr;
    }

    /* JADX INFO: renamed from: w */
    private static void m12938w(InputStream inputStream, C2730c c2730c) {
        BitSet bitSetValueOf = BitSet.valueOf(AbstractC2731d.m12871d(inputStream, AbstractC2731d.m12868a(c2730c.f10677g * 2)));
        int i7 = 0;
        while (true) {
            int i8 = c2730c.f10677g;
            if (i7 >= i8) {
                return;
            }
            int iM12930o = m12930o(bitSetValueOf, i7, i8);
            if (iM12930o != 0) {
                Integer num = (Integer) c2730c.f10679i.get(Integer.valueOf(i7));
                if (num == null) {
                    num = 0;
                }
                c2730c.f10679i.put(Integer.valueOf(i7), Integer.valueOf(iM12930o | num.intValue()));
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: x */
    static C2730c[] m12939x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2736i.f10703b)) {
            throw AbstractC2731d.m12870c("Unsupported version");
        }
        int iM12877j = AbstractC2731d.m12877j(inputStream);
        byte[] bArrM12872e = AbstractC2731d.m12872e(inputStream, (int) AbstractC2731d.m12876i(inputStream), (int) AbstractC2731d.m12876i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC2731d.m12870c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM12872e);
        try {
            C2730c[] c2730cArrM12940y = m12940y(byteArrayInputStream, str, iM12877j);
            byteArrayInputStream.close();
            return c2730cArrM12940y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    private static C2730c[] m12940y(InputStream inputStream, String str, int i7) {
        if (inputStream.available() == 0) {
            return new C2730c[0];
        }
        C2730c[] c2730cArr = new C2730c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM12875h = AbstractC2731d.m12875h(inputStream);
            int iM12875h2 = AbstractC2731d.m12875h(inputStream);
            c2730cArr[i8] = new C2730c(str, AbstractC2731d.m12873f(inputStream, iM12875h), AbstractC2731d.m12876i(inputStream), 0L, iM12875h2, (int) AbstractC2731d.m12876i(inputStream), (int) AbstractC2731d.m12876i(inputStream), new int[iM12875h2], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            C2730c c2730c = c2730cArr[i9];
            m12932q(inputStream, c2730c);
            c2730c.f10678h = m12929n(inputStream, c2730c.f10675e);
            m12938w(inputStream, c2730c);
        }
        return c2730cArr;
    }

    /* JADX INFO: renamed from: z */
    private static int m12941z(int i7) {
        return (i7 + 7) & (-8);
    }
}
