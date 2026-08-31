package p117O5;

import java.util.logging.Logger;
import p063H5.C0535c;
import p122P3.AbstractC1213q;

/* JADX INFO: renamed from: O5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1151c {

    /* JADX INFO: renamed from: a */
    private static final Logger f4074a = Logger.getLogger(AbstractC1151c.class.getName());

    /* JADX INFO: renamed from: b */
    static boolean f4075b;

    /* JADX INFO: renamed from: c */
    static final C0535c.c f4076c;

    /* JADX INFO: renamed from: O5.c$a */
    enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        f4075b = !AbstractC1213q.m5323a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f4076c = C0535c.c.m2365b("internal-stub-type");
    }
}
