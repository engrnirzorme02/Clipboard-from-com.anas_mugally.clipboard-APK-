package p152T5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1644w extends AbstractC1643v {
    /* JADX INFO: renamed from: t */
    public static void m6775t(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m6776u(List list, Comparator comparator) {
        AbstractC6118n.m27187e(list, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
