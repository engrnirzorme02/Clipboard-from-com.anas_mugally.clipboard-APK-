package p152T5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;
import p302m6.AbstractC6406h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1635n extends AbstractC1634m {
    /* JADX INFO: renamed from: A */
    public static final Appendable m6704A(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(fArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (float f7 : fArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Float.valueOf(f7)));
            } else {
                buffer.append(String.valueOf(f7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: B */
    public static final Appendable m6705B(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(iArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (int i9 : iArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Integer.valueOf(i9)));
            } else {
                buffer.append(String.valueOf(i9));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: C */
    public static final Appendable m6706C(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(jArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (long j7 : jArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Long.valueOf(j7)));
            } else {
                buffer.append(String.valueOf(j7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: D */
    public static final Appendable m6707D(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (Object obj : objArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            AbstractC6406h.m27531a(buffer, obj, interfaceC5367l);
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: E */
    public static final Appendable m6708E(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(sArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (short s7 : sArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Short.valueOf(s7)));
            } else {
                buffer.append(String.valueOf((int) s7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: F */
    public static final String m6709F(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(bArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6752y(bArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: G */
    public static final String m6710G(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(dArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6753z(dArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: H */
    public static final String m6711H(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(fArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6704A(fArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: I */
    public static final String m6712I(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(iArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6705B(iArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: J */
    public static final String m6713J(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(jArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6706C(jArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: K */
    public static final String m6714K(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6707D(objArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: L */
    public static final String m6715L(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(sArr, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6708E(sArr, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ String m6716M(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6709F(bArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ String m6717N(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6710G(dArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ String m6718O(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6711H(fArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ String m6719P(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6712I(iArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ String m6720Q(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6713J(jArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ String m6721R(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6714K(objArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ String m6722S(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6715L(sArr, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: T */
    public static Object m6723T(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[m6749v(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: U */
    public static char m6724U(char[] cArr) {
        AbstractC6118n.m27187e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: V */
    public static Object m6725V(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public static final Object[] m6726W(Object[] objArr, Comparator comparator) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
        AbstractC1634m.m6703p(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: X */
    public static List m6727X(Object[] objArr, Comparator comparator) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        return AbstractC1634m.m6690c(m6726W(objArr, comparator));
    }

    /* JADX INFO: renamed from: Y */
    public static final Collection m6728Y(Object[] objArr, Collection destination) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    /* JADX INFO: renamed from: Z */
    public static List m6729Z(byte[] bArr) {
        AbstractC6118n.m27187e(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? m6736g0(bArr) : AbstractC1639r.m6759d(Byte.valueOf(bArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: a0 */
    public static List m6730a0(double[] dArr) {
        AbstractC6118n.m27187e(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? m6737h0(dArr) : AbstractC1639r.m6759d(Double.valueOf(dArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: b0 */
    public static List m6731b0(float[] fArr) {
        AbstractC6118n.m27187e(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? m6738i0(fArr) : AbstractC1639r.m6759d(Float.valueOf(fArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: c0 */
    public static List m6732c0(int[] iArr) {
        AbstractC6118n.m27187e(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? m6739j0(iArr) : AbstractC1639r.m6759d(Integer.valueOf(iArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: d0 */
    public static List m6733d0(long[] jArr) {
        AbstractC6118n.m27187e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? m6740k0(jArr) : AbstractC1639r.m6759d(Long.valueOf(jArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: e0 */
    public static List m6734e0(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m6741l0(objArr) : AbstractC1639r.m6759d(objArr[0]);
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: f0 */
    public static List m6735f0(short[] sArr) {
        AbstractC6118n.m27187e(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? m6742m0(sArr) : AbstractC1639r.m6759d(Short.valueOf(sArr[0]));
        }
        return AbstractC1640s.m6765j();
    }

    /* JADX INFO: renamed from: g0 */
    public static final List m6736g0(byte[] bArr) {
        AbstractC6118n.m27187e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b7 : bArr) {
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public static final List m6737h0(double[] dArr) {
        AbstractC6118n.m27187e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d7 : dArr) {
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public static final List m6738i0(float[] fArr) {
        AbstractC6118n.m27187e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public static final List m6739j0(int[] iArr) {
        AbstractC6118n.m27187e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final List m6740k0(long[] jArr) {
        AbstractC6118n.m27187e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m6741l0(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        return new ArrayList(AbstractC1640s.m6762g(objArr));
    }

    /* JADX INFO: renamed from: m0 */
    public static final List m6742m0(short[] sArr) {
        AbstractC6118n.m27187e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s7 : sArr) {
            arrayList.add(Short.valueOf(s7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Set m6743n0(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) m6728Y(objArr, new LinkedHashSet(AbstractC1612J.m6623e(objArr.length))) : AbstractC1618P.m6649c(objArr[0]);
        }
        return AbstractC1619Q.m6650d();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m6744q(Object[] objArr, Object obj) {
        AbstractC6118n.m27187e(objArr, "<this>");
        return m6751x(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: r */
    public static List m6745r(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        return (List) m6746s(objArr, new ArrayList());
    }

    /* JADX INFO: renamed from: s */
    public static final Collection m6746s(Object[] objArr, Collection destination) {
        AbstractC6118n.m27187e(objArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX INFO: renamed from: t */
    public static Object m6747t(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: u */
    public static int m6748u(long[] jArr) {
        AbstractC6118n.m27187e(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m6749v(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        return objArr.length - 1;
    }

    /* JADX INFO: renamed from: w */
    public static Object m6750w(Object[] objArr, int i7) {
        AbstractC6118n.m27187e(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    /* JADX INFO: renamed from: x */
    public static int m6751x(Object[] objArr, Object obj) {
        AbstractC6118n.m27187e(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (AbstractC6118n.m27183a(obj, objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static final Appendable m6752y(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(bArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (byte b7 : bArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Byte.valueOf(b7)));
            } else {
                buffer.append(String.valueOf((int) b7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: z */
    public static final Appendable m6753z(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(dArr, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (double d7 : dArr) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (interfaceC5367l != null) {
                buffer.append((CharSequence) interfaceC5367l.invoke(Double.valueOf(d7)));
            } else {
                buffer.append(String.valueOf(d7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }
}
