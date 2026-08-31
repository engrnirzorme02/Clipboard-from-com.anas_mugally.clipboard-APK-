package p367u5;

import com.google.gson.AbstractC5028g;
import com.google.gson.internal.bind.AbstractC5044n;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import p391x5.C7417c;

/* JADX INFO: renamed from: u5.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7167F {
    /* JADX INFO: renamed from: a */
    public static void m31675a(AbstractC5028g abstractC5028g, C7417c c7417c) {
        AbstractC5044n.f19177V.mo22637d(c7417c, abstractC5028g);
    }

    /* JADX INFO: renamed from: b */
    public static Writer m31676b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    /* JADX INFO: renamed from: u5.F$b */
    private static final class b extends Writer {

        /* JADX INFO: renamed from: a */
        private final Appendable f28634a;

        /* JADX INFO: renamed from: b */
        private final a f28635b = new a();

        /* JADX INFO: renamed from: u5.F$b$a */
        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a */
            private char[] f28636a;

            /* JADX INFO: renamed from: b */
            private String f28637b;

            private a() {
            }

            /* JADX INFO: renamed from: a */
            void m31677a(char[] cArr) {
                this.f28636a = cArr;
                this.f28637b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i7) {
                return this.f28636a[i7];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f28636a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i7, int i8) {
                return new String(this.f28636a, i7, i8 - i7);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f28637b == null) {
                    this.f28637b = new String(this.f28636a);
                }
                return this.f28637b;
            }
        }

        b(Appendable appendable) {
            this.f28634a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) throws IOException {
            this.f28635b.m31677a(cArr);
            this.f28634a.append(this.f28635b, i7, i8 + i7);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f28634a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i7) throws IOException {
            this.f28634a.append((char) i7);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i7, int i8) throws IOException {
            this.f28634a.append(charSequence, i7, i8);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i7, int i8) throws IOException {
            Objects.requireNonNull(str);
            this.f28634a.append(str, i7, i8 + i7);
        }
    }
}
