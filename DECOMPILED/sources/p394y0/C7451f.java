package p394y0;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0177h;

/* JADX INFO: renamed from: y0.f */
/* JADX INFO: loaded from: classes.dex */
public class C7451f {

    /* JADX INFO: renamed from: a */
    public final Context f29889a;

    /* JADX INFO: renamed from: b */
    public final String f29890b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0177h.c f29891c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7462q.e f29892d;

    /* JADX INFO: renamed from: e */
    public final List f29893e;

    /* JADX INFO: renamed from: f */
    public final boolean f29894f;

    /* JADX INFO: renamed from: g */
    public final AbstractC7462q.d f29895g;

    /* JADX INFO: renamed from: h */
    public final Executor f29896h;

    /* JADX INFO: renamed from: i */
    public final Executor f29897i;

    /* JADX INFO: renamed from: j */
    public final Intent f29898j;

    /* JADX INFO: renamed from: k */
    public final boolean f29899k;

    /* JADX INFO: renamed from: l */
    public final boolean f29900l;

    /* JADX INFO: renamed from: m */
    private final Set f29901m;

    /* JADX INFO: renamed from: n */
    public final String f29902n;

    /* JADX INFO: renamed from: o */
    public final File f29903o;

    /* JADX INFO: renamed from: p */
    public final Callable f29904p;

    /* JADX INFO: renamed from: q */
    public final List f29905q;

    /* JADX INFO: renamed from: r */
    public final List f29906r;

    /* JADX INFO: renamed from: s */
    public final boolean f29907s;

    public C7451f(Context context, String str, InterfaceC0177h.c sqliteOpenHelperFactory, AbstractC7462q.e migrationContainer, List list, boolean z7, AbstractC7462q.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z8, boolean z9, Set set, String str2, File file, Callable callable, AbstractC7462q.f fVar, List typeConverters, List autoMigrationSpecs) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC6118n.m27187e(migrationContainer, "migrationContainer");
        AbstractC6118n.m27187e(journalMode, "journalMode");
        AbstractC6118n.m27187e(queryExecutor, "queryExecutor");
        AbstractC6118n.m27187e(transactionExecutor, "transactionExecutor");
        AbstractC6118n.m27187e(typeConverters, "typeConverters");
        AbstractC6118n.m27187e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f29889a = context;
        this.f29890b = str;
        this.f29891c = sqliteOpenHelperFactory;
        this.f29892d = migrationContainer;
        this.f29893e = list;
        this.f29894f = z7;
        this.f29895g = journalMode;
        this.f29896h = queryExecutor;
        this.f29897i = transactionExecutor;
        this.f29898j = intent;
        this.f29899k = z8;
        this.f29900l = z9;
        this.f29901m = set;
        this.f29902n = str2;
        this.f29903o = file;
        this.f29904p = callable;
        this.f29905q = typeConverters;
        this.f29906r = autoMigrationSpecs;
        this.f29907s = intent != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m33012a(int i7, int i8) {
        Set set;
        return (i7 <= i8 || !this.f29900l) && this.f29899k && ((set = this.f29901m) == null || !set.contains(Integer.valueOf(i7)));
    }
}
