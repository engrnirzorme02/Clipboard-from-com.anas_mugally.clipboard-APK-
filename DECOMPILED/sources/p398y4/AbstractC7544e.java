package p398y4;

import java.util.Iterator;
import p030D4.AbstractC0207k;
import p030D4.C0197a;
import p030D4.C0199c;
import p030D4.C0202f;
import p030D4.C0208l;
import p030D4.C0209m;
import p030D4.C0216t;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: y4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7544e {
    /* JADX INFO: renamed from: a */
    private static long m33207a(AbstractC0207k abstractC0207k) {
        long length = 8;
        if (!(abstractC0207k instanceof C0202f) && !(abstractC0207k instanceof C0208l)) {
            if (abstractC0207k instanceof C0197a) {
                length = 4;
            } else {
                if (!(abstractC0207k instanceof C0216t)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + abstractC0207k.getClass());
                }
                length = ((long) ((String) abstractC0207k.getValue()).length()) + 2;
            }
        }
        return abstractC0207k.mo1006i().isEmpty() ? length : length + 24 + m33207a((AbstractC0207k) abstractC0207k.mo1006i());
    }

    /* JADX INFO: renamed from: b */
    public static long m33208b(InterfaceC0210n interfaceC0210n) {
        if (interfaceC0210n.isEmpty()) {
            return 4L;
        }
        if (interfaceC0210n.mo1000H()) {
            return m33207a((AbstractC0207k) interfaceC0210n);
        }
        AbstractC7551l.m33234g(interfaceC0210n instanceof C0199c, "Unexpected node type: " + interfaceC0210n.getClass());
        Iterator it = interfaceC0210n.iterator();
        long length = 1;
        while (it.hasNext()) {
            C0209m c0209m = (C0209m) it.next();
            length = length + ((long) c0209m.m1082c().m992d().length()) + 4 + m33208b(c0209m.m1083d());
        }
        return !interfaceC0210n.mo1006i().isEmpty() ? length + 12 + m33207a((AbstractC0207k) interfaceC0210n.mo1006i()) : length;
    }

    /* JADX INFO: renamed from: c */
    public static int m33209c(InterfaceC0210n interfaceC0210n) {
        int iM33209c = 0;
        if (interfaceC0210n.isEmpty()) {
            return 0;
        }
        if (interfaceC0210n.mo1000H()) {
            return 1;
        }
        AbstractC7551l.m33234g(interfaceC0210n instanceof C0199c, "Unexpected node type: " + interfaceC0210n.getClass());
        Iterator it = interfaceC0210n.iterator();
        while (it.hasNext()) {
            iM33209c += m33209c(((C0209m) it.next()).m1083d());
        }
        return iM33209c;
    }
}
