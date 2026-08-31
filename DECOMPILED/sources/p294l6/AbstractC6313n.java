package p294l6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;
import p246f6.InterfaceC5442a;
import p302m6.AbstractC6406h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: l6.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6313n extends AbstractC6312m {

    /* JADX INFO: renamed from: l6.n$a */
    public static final class a implements Iterable, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6304e f24117a;

        public a(InterfaceC6304e interfaceC6304e) {
            this.f24117a = interfaceC6304e;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f24117a.iterator();
        }
    }

    /* JADX INFO: renamed from: h */
    public static Iterable m27243h(InterfaceC6304e interfaceC6304e) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        return new a(interfaceC6304e);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC6304e m27244i(InterfaceC6304e interfaceC6304e, int i7) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        if (i7 >= 0) {
            if (i7 == 0) {
                return interfaceC6304e;
            }
            return interfaceC6304e instanceof InterfaceC6302c ? ((InterfaceC6302c) interfaceC6304e).mo27227a(i7) : new C6301b(interfaceC6304e, i7);
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: j */
    public static Object m27245j(InterfaceC6304e interfaceC6304e) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        Iterator it = interfaceC6304e.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX INFO: renamed from: k */
    public static final Appendable m27246k(InterfaceC6304e interfaceC6304e, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (Object obj : interfaceC6304e) {
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

    /* JADX INFO: renamed from: l */
    public static final String m27247l(InterfaceC6304e interfaceC6304e, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m27246k(interfaceC6304e, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m27248m(InterfaceC6304e interfaceC6304e, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
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
        return m27247l(interfaceC6304e, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: n */
    public static List m27249n(InterfaceC6304e interfaceC6304e) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        Iterator it = interfaceC6304e.iterator();
        if (!it.hasNext()) {
            return AbstractC1638q.m6765j();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1638q.m6759d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
