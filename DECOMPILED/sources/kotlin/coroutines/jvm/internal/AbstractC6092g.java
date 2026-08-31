package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6092g {
    /* JADX INFO: renamed from: a */
    private static final void m27129a(int i7, int i8) {
        if (i8 <= i7) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i7 + ", got " + i8 + ". Please update the Kotlin standard library.").toString());
    }

    /* JADX INFO: renamed from: b */
    private static final InterfaceC6091f m27130b(AbstractC6086a abstractC6086a) {
        return (InterfaceC6091f) abstractC6086a.getClass().getAnnotation(InterfaceC6091f.class);
    }

    /* JADX INFO: renamed from: c */
    private static final int m27131c(AbstractC6086a abstractC6086a) {
        try {
            Field declaredField = abstractC6086a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC6086a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement m27132d(AbstractC6086a abstractC6086a) {
        String strM27124c;
        AbstractC6118n.m27187e(abstractC6086a, "<this>");
        InterfaceC6091f interfaceC6091fM27130b = m27130b(abstractC6086a);
        if (interfaceC6091fM27130b == null) {
            return null;
        }
        m27129a(1, interfaceC6091fM27130b.m27128v());
        int iM27131c = m27131c(abstractC6086a);
        int i7 = iM27131c < 0 ? -1 : interfaceC6091fM27130b.m27126l()[iM27131c];
        String strM27137b = C6094i.f23851a.m27137b(abstractC6086a);
        if (strM27137b == null) {
            strM27124c = interfaceC6091fM27130b.m27124c();
        } else {
            strM27124c = strM27137b + '/' + interfaceC6091fM27130b.m27124c();
        }
        return new StackTraceElement(strM27124c, interfaceC6091fM27130b.m27127m(), interfaceC6091fM27130b.m27125f(), i7);
    }
}
