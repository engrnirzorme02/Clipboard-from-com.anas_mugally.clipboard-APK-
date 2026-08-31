package p152T5;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1641t extends AbstractC1640s {
    /* JADX INFO: renamed from: s */
    public static int m6774s(Iterable iterable, int i7) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
