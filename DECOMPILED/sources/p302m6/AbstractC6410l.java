package p302m6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1603A;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6410l extends AbstractC6407i {
    /* JADX INFO: renamed from: d */
    private static final InterfaceC5367l m27534d(final String str) {
        return str.length() == 0 ? new InterfaceC5367l() { // from class: m6.j
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractC6410l.m27535e((String) obj);
            }
        } : new InterfaceC5367l() { // from class: m6.k
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractC6410l.m27536f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m27535e(String line) {
        AbstractC6118n.m27187e(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m27536f(String str, String line) {
        AbstractC6118n.m27187e(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX INFO: renamed from: g */
    private static final int m27537g(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (!AbstractC6400b.m27518c(str.charAt(i7))) {
                if (i7 == -1) {
                    return str.length();
                }
                return i7;
            }
            i7++;
        }
        i7 = -1;
        if (i7 == -1) {
            return str.length();
        }
        return i7;
    }

    /* JADX INFO: renamed from: h */
    public static final String m27538h(String str, String newIndent) {
        String str2;
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(newIndent, "newIndent");
        List listM27611j0 = AbstractC6420v.m27611j0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM27611j0) {
            if (!AbstractC6420v.m27604c0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m27537g((String) it.next())));
        }
        Integer num = (Integer) AbstractC1638q.m6581U(arrayList2);
        int i7 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM27611j0.size());
        InterfaceC5367l interfaceC5367lM27534d = m27534d(newIndent);
        int iK = AbstractC1638q.m6766k(listM27611j0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM27611j0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            String str3 = (String) obj2;
            if ((i7 == 0 || i7 == iK) && AbstractC6420v.m27604c0(str3)) {
                str3 = null;
            } else {
                String strM27628T0 = AbstractC6422x.m27628T0(str3, iIntValue);
                if (strM27628T0 != null && (str2 = (String) interfaceC5367lM27534d.invoke(strM27628T0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i7 = i8;
        }
        return ((StringBuilder) AbstractC1603A.m6575O(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* JADX INFO: renamed from: i */
    public static final String m27539i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(newIndent, "newIndent");
        AbstractC6118n.m27187e(marginPrefix, "marginPrefix");
        if (AbstractC6420v.m27604c0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM27611j0 = AbstractC6420v.m27611j0(str);
        int length = str.length() + (newIndent.length() * listM27611j0.size());
        InterfaceC5367l interfaceC5367lM27534d = m27534d(newIndent);
        int iK = AbstractC1638q.m6766k(listM27611j0);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : listM27611j0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i7 == 0 || i7 == iK) && AbstractC6420v.m27604c0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!AbstractC6400b.m27518c(str4.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i10 = i9;
                    str2 = marginPrefix;
                    if (AbstractC6417s.m27556J(str4, str2, i10, false, 4, null)) {
                        int length3 = str2.length() + i10;
                        AbstractC6118n.m27185c(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC6118n.m27186d(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) interfaceC5367lM27534d.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i7 = i8;
            marginPrefix = str2;
        }
        return ((StringBuilder) AbstractC1603A.m6575O(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m27540j(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        return m27538h(str, "");
    }

    /* JADX INFO: renamed from: k */
    public static final String m27541k(String str, String marginPrefix) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(marginPrefix, "marginPrefix");
        return m27539i(str, "", marginPrefix);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m27542l(String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "|";
        }
        return m27541k(str, str2);
    }
}
