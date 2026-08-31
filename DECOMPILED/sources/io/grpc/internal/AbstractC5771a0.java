package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.a0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5771a0 implements C5728D.g {

    /* JADX INFO: renamed from: a */
    private static final Throwable f22416a = m25846a();

    /* JADX INFO: renamed from: a */
    private static Throwable m25846a() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e7) {
            return e7;
        } catch (Error e8) {
            return e8;
        } catch (RuntimeException e9) {
            return e9;
        }
    }
}
