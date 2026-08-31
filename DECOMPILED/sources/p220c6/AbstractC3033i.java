package p220c6;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: c6.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3033i {
    /* JADX INFO: renamed from: a */
    public static final long m15006a(Reader reader, Writer out, int i7) throws IOException {
        AbstractC6118n.m27187e(reader, "<this>");
        AbstractC6118n.m27187e(out, "out");
        char[] cArr = new char[i7];
        int i8 = reader.read(cArr);
        long j7 = 0;
        while (i8 >= 0) {
            out.write(cArr, 0, i8);
            j7 += (long) i8;
            i8 = reader.read(cArr);
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m15007b(Reader reader, Writer writer, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return m15006a(reader, writer, i7);
    }

    /* JADX INFO: renamed from: c */
    public static final String m15008c(Reader reader) {
        AbstractC6118n.m27187e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m15007b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }
}
