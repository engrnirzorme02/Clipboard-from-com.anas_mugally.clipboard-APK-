package p079J5;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p072I6.C0648e;
import p072I6.C0651h;
import p095L5.C0853i;
import p095L5.EnumC0845a;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.j */
/* JADX INFO: loaded from: classes.dex */
class C0696j {

    /* JADX INFO: renamed from: a */
    private final Logger f2825a;

    /* JADX INFO: renamed from: b */
    private final Level f2826b;

    /* JADX INFO: renamed from: J5.j$a */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: renamed from: J5.j$b */
    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: a */
        private final int f2837a;

        b(int i7) {
            this.f2837a = i7;
        }

        /* JADX INFO: renamed from: c */
        public int m3383c() {
            return this.f2837a;
        }
    }

    C0696j(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* JADX INFO: renamed from: a */
    private boolean m3370a() {
        return this.f2825a.isLoggable(this.f2826b);
    }

    /* JADX INFO: renamed from: l */
    private static String m3371l(C0648e c0648e) {
        if (c0648e.m3046h1() <= 64) {
            return c0648e.m3048i1().mo3104q();
        }
        return c0648e.m3049j1((int) Math.min(c0648e.m3046h1(), 64L)).mo3104q() + "...";
    }

    /* JADX INFO: renamed from: m */
    private static String m3372m(C0853i c0853i) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (c0853i.m3964d(bVar.m3383c())) {
                enumMap.put(bVar, Integer.valueOf(c0853i.m3961a(bVar.m3383c())));
            }
        }
        return enumMap.toString();
    }

    /* JADX INFO: renamed from: b */
    void m3373b(a aVar, int i7, C0648e c0648e, int i8, boolean z7) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " DATA: streamId=" + i7 + " endStream=" + z7 + " length=" + i8 + " bytes=" + m3371l(c0648e));
        }
    }

    /* JADX INFO: renamed from: c */
    void m3374c(a aVar, int i7, EnumC0845a enumC0845a, C0651h c0651h) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " GO_AWAY: lastStreamId=" + i7 + " errorCode=" + enumC0845a + " length=" + c0651h.m3090F() + " bytes=" + m3371l(new C0648e().mo3017N0(c0651h)));
        }
    }

    /* JADX INFO: renamed from: d */
    void m3375d(a aVar, int i7, List list, boolean z7) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " HEADERS: streamId=" + i7 + " headers=" + list + " endStream=" + z7);
        }
    }

    /* JADX INFO: renamed from: e */
    void m3376e(a aVar, long j7) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " PING: ack=false bytes=" + j7);
        }
    }

    /* JADX INFO: renamed from: f */
    void m3377f(a aVar, long j7) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " PING: ack=true bytes=" + j7);
        }
    }

    /* JADX INFO: renamed from: g */
    void m3378g(a aVar, int i7, int i8, List list) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " PUSH_PROMISE: streamId=" + i7 + " promisedStreamId=" + i8 + " headers=" + list);
        }
    }

    /* JADX INFO: renamed from: h */
    void m3379h(a aVar, int i7, EnumC0845a enumC0845a) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " RST_STREAM: streamId=" + i7 + " errorCode=" + enumC0845a);
        }
    }

    /* JADX INFO: renamed from: i */
    void m3380i(a aVar, C0853i c0853i) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " SETTINGS: ack=false settings=" + m3372m(c0853i));
        }
    }

    /* JADX INFO: renamed from: j */
    void m3381j(a aVar) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: renamed from: k */
    void m3382k(a aVar, int i7, long j7) {
        if (m3370a()) {
            this.f2825a.log(this.f2826b, aVar + " WINDOW_UPDATE: streamId=" + i7 + " windowSizeIncrement=" + j7);
        }
    }

    C0696j(Level level, Logger logger) {
        this.f2826b = (Level) AbstractC1209m.m5303o(level, "level");
        this.f2825a = (Logger) AbstractC1209m.m5303o(logger, "logger");
    }
}
