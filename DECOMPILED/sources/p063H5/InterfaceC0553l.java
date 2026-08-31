package p063H5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: H5.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0553l extends InterfaceC0557n, InterfaceC0569u {

    /* JADX INFO: renamed from: H5.l$a */
    public static final class a implements InterfaceC0553l {
        @Override // p063H5.InterfaceC0557n, p063H5.InterfaceC0569u
        /* JADX INFO: renamed from: a */
        public String mo2443a() {
            return "gzip";
        }

        @Override // p063H5.InterfaceC0569u
        /* JADX INFO: renamed from: b */
        public InputStream mo2444b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // p063H5.InterfaceC0557n
        /* JADX INFO: renamed from: c */
        public OutputStream mo2445c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* JADX INFO: renamed from: H5.l$b */
    public static final class b implements InterfaceC0553l {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC0553l f2096a = new b();

        private b() {
        }

        @Override // p063H5.InterfaceC0557n, p063H5.InterfaceC0569u
        /* JADX INFO: renamed from: a */
        public String mo2443a() {
            return "identity";
        }

        @Override // p063H5.InterfaceC0569u
        /* JADX INFO: renamed from: b */
        public InputStream mo2444b(InputStream inputStream) {
            return inputStream;
        }

        @Override // p063H5.InterfaceC0557n
        /* JADX INFO: renamed from: c */
        public OutputStream mo2445c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
