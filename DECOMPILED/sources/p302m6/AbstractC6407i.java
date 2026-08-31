package p302m6;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6407i {
    /* JADX INFO: renamed from: a */
    public static void m27531a(Appendable appendable, Object obj, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(appendable, "<this>");
        if (interfaceC5367l != null) {
            appendable.append((CharSequence) interfaceC5367l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
