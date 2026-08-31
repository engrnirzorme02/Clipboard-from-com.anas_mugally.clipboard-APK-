package p394y0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: y0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7456k {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f29911a;

    /* JADX INFO: renamed from: b */
    private final Set f29912b;

    public C7456k(AbstractC7462q database) {
        AbstractC6118n.m27187e(database, "database");
        this.f29911a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC6118n.m27186d(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f29912b = setNewSetFromMap;
    }
}
